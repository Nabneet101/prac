import java.util.Scanner;

public class Q_5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.nextLine();
		String s1=s.toUpperCase();
		char[]c=s.toCharArray();
		sc.close();
		if(c[0]!=s1.charAt(0))
				{
					System.out.println("First letter must be capital");
				}
		else
		{
			System.out.println("first letter is Capital");
		}
	}

}
