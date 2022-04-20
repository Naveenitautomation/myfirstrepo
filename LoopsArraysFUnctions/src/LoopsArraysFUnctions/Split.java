package LoopsArraysFUnctions;

public class Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Split
		   String transactionString = "Your Order is processed. Transaction ID is 0001";
		   String result[] = transactionString.split(" ");
		   System.out.println(result.length);
		   
	       for(int rnum=0;rnum<=result.length;rnum++) {
	    	  System.out.println("Row Number : " +rnum);
	    	   
	    	   for(int cnum=0;cnum<result[rnum].length();cnum++) {
	    		   String data = result [cnum];
	    		   System.out.println(data);
	    	   }
	       }
	       

	}

}
