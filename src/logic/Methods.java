package logic;

import java.util.Random;

public class Methods {
	
	String [] candidates=new String [3];
	String [] townsArray=new String [5];
	int  [][] votes= new  int [candidates.length+1][townsArray.length+1];
	
	
	
	
	
	
	
	   public void loadVotes(){
	        for( int i = 0 ; i < votes.length ; i++ ){
	            for( int j = 0 ; j < votes[i].length ; j++ ){
	                votes[i][j] = new Random().nextInt(99) + 1;
	            }
	        }
	    }
	
	   public String showvotes(){
	        StringBuilder stringbuilder = new StringBuilder();

	        for( int i = 0 ; i < votes.length ; i++ ){
	            for( int j = 0 ; j < votes[i].length ; j++ ){
	                stringbuilder.append( votes[i][j] + "\t");
	            }
	            stringbuilder.append("\n");
	        }

	        return stringbuilder.toString();
	    }
	

}
