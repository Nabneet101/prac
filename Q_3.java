import java.util.Scanner;

public class Q_3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s1=sc.nextLine().toLowerCase();
		char[]str=s1.toCharArray();
		
		int count=0;
		for (char c : str) {
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			{
				count++;
				System.out.println("vowel is ==>"+c);
			}
		}
		System.out.println("total number of vowels present are ==> "+count);
	}
}
