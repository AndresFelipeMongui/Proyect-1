package view;
import logic.Methods;
public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String[] candidates=	{"can1","can2","can3","can4","can5"};
	String [] townsArray=	{"m1","m2","m3"	};
	
	
	Methods M=new Methods(candidates.length , townsArray.length );
    M.loadVotes();
    M.votesCandidate(); 
    M.valMax();
    
    System.out.println("Candidato Ganador");
    
    System.out.println(M.showArrays(M.candidateWin()));
   
    
    System.out.println(M.showArrays(M.valMax()));
    
    System.out.println(" Matriz ");
	System.out.println(M.showvotes(candidates,townsArray));
	
System.out.println("Total votos por municipio \n"
		+ "   "+townsArray[0]+"   "+townsArray[1]+"   "+ townsArray[2]);
int[] suma=M.votesTotal();
System.out.print(M.showArrays(suma));
	
	
	
	}

}
