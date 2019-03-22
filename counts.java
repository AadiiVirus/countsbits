package scLab1;

class myClass{
	
	public void countBits()
	{
		String sc= "10";
	    int i = Integer.parseInt(sc);		//Converting string into integer	
		System.out.println(i); //displaying string
		//displaying no of bits
		 System.out.println("Number of one bits = " + Integer.bitCount(i)); 
		}
}


public class counts {

	public static void main(String[] args) {
	myClass m=new myClass();
	m.countBits();
		
	}
	

}
