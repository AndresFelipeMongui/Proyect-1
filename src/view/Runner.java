package view;
import logic.Methods;
public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String[] candidates=	{"1","2","3","4","5"};
	String [] townsArray=	{"m1","m2","m3"	};
	Methods v= new Methods(candidates, townsArray);
	System.out.println(v.showArrays());
	Methods M=new Methods(candidates.length , townsArray.length );
	System.out.println(M.showvotes());
	System.out.println(M.votesTotal());
	
	}

}
