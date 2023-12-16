package logic;

import java.util.Random;

public class Methods {
	
	String [] candidates=new String [5];
	String [] townsArray=new String [3];
	    private int[][] votes;
	    private int rows;
	    private int colums;
	private int size_Default=5;
	private int size_Defaulttowns=3;
	private int position;
	
	 
	 
	 public Methods(String[] candidates, String[] townsArray) {
	    	
	        this.candidates = candidates;
	        this.townsArray=townsArray;
	        position=candidates.length;
	    }
	 
	 public Methods(int rows, int colums) {
			this.rows=townsArray.length;
			this.colums=candidates.length;
			this.votes= new  int [rows][colums];
	        loadVotes();
	    }

	
	
	  public Methods(int[][] votes) {
	        this.votes = votes;
	    }
	
	 public String showArrays()	{
	    	
	    	StringBuilder string=new StringBuilder();
	    	string.append("[ ");
	    	
	    	for (int i=0;i<position;i++)	{
	    		
	    		string.append(candidates[i]);
	    		
	    		if (i !=position - 1){
	    			string.append(", ");
	    		}
	    		
	    		
	    	}
	    	string.append("]");
	    	
	    	return string.toString();
	    }
	 
	 
	
	   public void loadVotes(){
		   
		   
	        for( int i = 0 ; i < votes.length ; i++ ){
	            for( int j = 0 ; j < votes[i].length ; j++ ){
	                votes[i][j] = new Random().nextInt(99) + 1;
	            }
	        }
	   }
	   
	 //Visualizar la información del candidato ganador
	   public int[] candidateWin()	{
		   int column1=0;
		   int column2=1;
		   int column3=2;
		   for(int i=0;i<votes.length;i++)	{
			   
		   }
		   return null;
	   }
	   
	   public String showvotes(){
	        StringBuilder stringBuilder = new StringBuilder();
            
	        for( int i = 0 ; i < votes.length  ; i++ ){
	            for( int j = 0 ; j < votes[i].length   ; j++ ){
	                stringBuilder.append( votes[i][j] + "\t");
	            }
	            stringBuilder.append("\n");
	        }

	        return stringBuilder.toString();
	    }
	   
	   //- El total de votos por municipio
	   public int votesTotal()	{
		   int column1=0;
		   int column2=1;
		   int column3=2;
		   int sum=0;
		   for(int i=0;i<votes.length;i++)	{
			   sum +=votes[i][column1];
			   
		   }
		   return sum;
	   }
	

}
