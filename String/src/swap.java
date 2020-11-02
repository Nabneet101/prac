
public class swap {
	public static void main(String[] args) {
		String a="nabneet";
		String b="raj";
		System.out.println("a is "+a+" b is " +a );
		a=a+b;
		b=a.substring(0,a.length()-b.length());
		a=a.substring(b.length());
		System.out.println("a is ==> "+a+" b is ==> "+b);
		
		
	}

}
