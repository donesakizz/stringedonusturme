package FormatPrinting;

public class twoparameter {

	public static void main(String[] args) {
		int x =1234567890;
		System.out.println("x="+x);
		double y =123456789.24;
		System.out.println("y="+y);
		String s=String.format("integer %,d and decimal number %,.2f" , x , y);
		
		System.out.println("s="+s);

	}

}
