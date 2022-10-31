package convertToString;

public class convertToString {

	public static void main(String[] args) {
		//enter the integer
		String s1 ,s2;
		int x=123;
		
		s1 = Integer.toString(x);
		System.out.println(x +"\t integer =>"  +"convert to string of\t "+s1);
		
		//enter the double
		double y =123.456;
		s2 = Double.toString(y);
		System.out.println( y +"\t double =>" +"convert to string of\t" +s2);

	}

}
