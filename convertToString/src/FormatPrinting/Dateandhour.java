package FormatPrinting;

public class Dateandhour {

	public static void main(String[] args)
	{
		String s=String.format("%tc" , new java.util.Date() );
		System.out.println("s =" +s);
		
		

		String h=String.format("%tr" , new java.util.Date() );
		System.out.println("h =" +h);
		
	}
	

}
