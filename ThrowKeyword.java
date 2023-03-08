package JavaBasics;

public class ThrowKeyword {

	public static void main(String[] args){
		
		// throw keyword is used to create your own Exception in java, created deliberately
		
		System.out.println("ABC");
		
		try {
		
		throw new Exception ("Mitul Exception");// it does not terminate your programme but it allows you to carry on
		}
		
		
		catch (Exception e) {
			e.printStackTrace();
		} 
		
		System.out.println("PQR");
	}}
	
		
		
		

	
