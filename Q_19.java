import java.util.Scanner;
import java.util.regex.Pattern;

public class Q_19 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		sc.close();
		if(Pattern.matches("\\d*",s))
		{
			System.out.println("yes,the string contains only digits");
		}
		else
		{
			System.out.println("no,the string is does not contain only digits");
		}
		
		//another method
		/*
		 * char s1[]=s.toCharArray(); for (char c : s1) { if(Character.isDigit(c)) {
		 * continue; } else
		 * 
		 * System.out.println(c+" ==> Is not a digit ");
		 * 
		 * }
		 */
	}

}
