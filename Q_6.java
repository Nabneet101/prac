import java.util.Arrays;
import java.util.Scanner;

public class Q_6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=0;;
		try {
			System.out.println("How many string you want to enter");
			n = sc.nextInt();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("enter a number  "+e);
		}
		String[]s=new String[n];
		sc.nextLine();
		
		System.out.println("enter the "+n+" string");
		for (int i = 0; i < n; i++) {
			 s[i]=sc.nextLine();
		}
		sc.close();
		System.out.println(Arrays.asList(s));
		Arrays.sort(s);
		System.out.println(Arrays.asList(s));
}
}