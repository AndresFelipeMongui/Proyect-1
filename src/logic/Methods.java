package logic;

import java.util.Random;

public class Methods {
	
	// Vectores 
	String [] candidates=new String [5];
	String [] townsArray=new String [3];
	
	    private int[][] votes;// matriz inicial
	    private int[] sumVotes;// Total de votos por candidato
	    private int[] valMax;//votos mayores por ciudad
	    private int[] suma;//Total de votos por municipio
	    private String[] wins;// candidatos con mayor cantidad de votos en los tres municipios
	    private int rows;
	    private int colums;
	    
	    //constructor que inicializa loa arreglos
 public Methods(String[] candidates, String[] townsArray) {
	    	
	        this.candidates = candidates;
	        this.townsArray=townsArray;
	        
	    }
	//constructor que inicializa la matriz
 public Methods(int rows, int colums) {
	 
		this.rows=townsArray.length;
		this.colums=candidates.length;
		this.votes= new  int [rows][colums];
		
     loadVotes();
 }
	 
 
 public Methods(int[][] votes) {
	 
     this.votes = votes;
 }	 
 
	//Constructor que devuelve en forma de string los vectores de tipo entero 
 public String showArrays(int [] suma)	{
 	
 	StringBuilder string=new StringBuilder();
 	

      string.append("[ ");
 	
 	for (int i=0;i<suma.length;i++)	{
 		
 		string.append(suma[i]);
 		
 		if (i !=suma.length - 1){
 			string.append(", ");
 		}
 		
 		
 	}
 	string.append("]");
 	
 	return string.toString();
 }
 
	// constructor que permite visualizar los arrays tipo string
 public String showArrays(String[] suma)	{
 	
 	StringBuilder string=new StringBuilder();
 	

   string.append("[ ");
 	
 	for (int i=0;i<suma.length;i++)	{
 		
 		string.append(suma[i]);
 		
 		if (i !=suma.length - 1){
 			string.append(", ");
 		}
 		
 		
 	}
 	string.append("]");
 	return string.toString();
 }
	
 
	//metodo que carga los votos a la matriz de forma aleatoria
 public void loadVotes(){
	   
	   
      for( int i = 0 ; i < votes.length ; i++ ){
          for( int j = 0 ; j < votes[i].length ; j++ ){
              votes[i][j] = new Random().nextInt(199) + 1;
          }
      }
 }
 
  // Método que retorna un String con los elementos de la matriz en forma matricial
  
  
 public String showvotes(String [] candidates, String[] townsArray ){
     StringBuilder stringBuilder = new StringBuilder();
     
    stringBuilder.append("\t");
    
    for (int i=0;i<townsArray.length;i++)	{
 	   stringBuilder.append(townsArray[i]+"\t");
    }
    stringBuilder.append("\n");
     for ( int i = 0 ; i < votes.length; i++ ){ 
    	 
     	 stringBuilder.append(candidates[i]).append("\t");
     	
         for ( int j = 0 ; j < votes[i].length; j++ ){
         	
             stringBuilder.append( votes[i][j] + "\t");
         }
      	   stringBuilder.append(sumVotes[i]+"\t");
         
         stringBuilder.append("\n");
     }

     return stringBuilder.toString();
 }
 
 // total votos por cada candidato
 
 public int[] votesCandidate()	{
	   int candidate1 = 0;      
	   int candidate2 = 1;      
	   int candidate3 = 2;      
	   int candidate4 = 3;     
	   int candidate5 = 4;      
	   
	   int suma1 = 0;
	   int suma2 = 0;
	   int suma3 = 0;
	   int suma4 = 0;
	   int suma5 = 0;
	   
	   for(int i=0;i<townsArray.length;i++)	{
		   suma1 += votes[candidate1][i];
		   suma2 += votes[candidate2][i];
		   suma3 += votes[candidate3][i];
		   suma4 += votes[candidate4][i];
		   suma5 += votes[candidate5][i];
		   
	   }
	    this.sumVotes = new int[] {suma1,suma2,suma3,suma4,suma5};
	   return sumVotes;
 }
	
//Visualizar la información del candidato ganador
 public String[] candidateWin()	{
	int win1;   String name = null;
	int win2;   String name2 = null;
	int win3;   String name3 = null;
	for(int i=0; i<candidates.length;i++)	{
		if(valMax[0]==i)	{
			name=candidates[i];	
		}
		if(valMax[1]==i)	{
			name2=candidates[i];	
		}
		if(valMax[2]==i)	{
			name3=candidates[i];	
		}
	}
	  
	    wins=new String[]	{name,name2,name3};
	    	return wins;    	
 }
 
 // permite conocer el indice del valor maximo
 public int [] valMax	()	{
	   int val1 = 0;   
	   int val2 = 1;  
	   int val3 = 2;   
	   
	   int max  = votes[0][val1];
	   int max2 = votes[0][val2];
	   int max3 = votes[0][val3];
	   
	   int index  = 0;
	   int index2 = 0;
	   int index3 = 0;
	   
	   for(int i=0;i<votes.length;i++)	{
		   
		  for(int j=0;j<votes[i].length;j++)	{
			  
			  if (max < votes[i][val1])	{
				  max = votes[i][val1];
				  index = i;
			  }
			  if (max2 < votes[i][val2])	{
				  max2 = votes[i][val2];
				  index2 = i;
			  }
			  if (max3 < votes[i][val3])	{
				  max3 = votes[i][val3];
				  index3 = i;
			  }
		  }
		   
		   
	   }
	   this.valMax = new int[]{index,index2,index3};
	   return valMax;
 }
	
	  
	   
	   
	   //- El total de votos por municipio
	   public int[] votesTotal()	{
		   int column1 = 0;
		   int column2 = 1;
		   int column3 = 2;
		   
		   int sum1 = 0;
		   int sum2 = 0;
		   int sum3 = 0;
		  
		   for(int i=0;i<votes.length;i++)	{
			   
			   sum1 +=votes[i][column1];
			   
			   sum2 +=votes[i][column2];
			   
			   sum3 +=votes[i][column3];
		   }
		 
		    suma = new int[]{sum1,sum2,sum3};
		   
		   return suma;
	   }
	   
	  
	

}
