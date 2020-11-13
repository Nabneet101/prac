import java.util.Scanner;

public class Q_17 {
	public static void main(String[] args) {
		System.out.println("ENTER THE STRING");
		Scanner Sc=new Scanner(System.in);
		String s=Sc.nextLine();
		System.out.println("WHICH CHARACTER DO YOU WANT TO REPLACE");
		String replace=Sc.nextLine();
		System.out.println("WHICH CHARACTER DO YOU WANT TO REPLACED WITH");
		String g=Sc.nextLine();
		s=s.replaceAll(replace,g);
		System.out.println(s);
		
		
	}

}
