import java.util.Scanner;

public class Q_8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String s=sc.nextLine();
		String str="";
		char []c=s.toCharArray();
		for (int i = c.length-1; i>=0 ; i--)
		{
			str=str+c[i];
		}
		
		if(s.equals(str))
		{
			System.out.println("it is pallindrone");
		}
		else
		{
			System.out.println("no it is not pallindrone");
		}
		//another method
		/*
		 *  StringBuilder s1=new StringBuilder(s); StringBuilder
		 * s2=s1.reverse(); if(s1.equals(s2)) { System.out.println("sdgbvfcxbfb"); }
		 * else { System.out.println("aaaaaaaaaaaaa"); }
		 */
	}

}
