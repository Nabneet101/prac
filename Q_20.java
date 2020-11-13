import java.util.Scanner;
public class Q_20 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		StringBuilder s1=new StringBuilder(sc.nextLine());
		s1=s1.reverse();
		System.out.println(s1);
		
		//Another method
		System.out.println("enter the string");
		String s=sc.nextLine();
		String copy="";
		for (int i = s.length()-1; i>=0; i--) {
			copy=copy+s.charAt(i);
		}
		System.out.println(copy);
	}
	

}
