import java.util.*;
import java.util.Scanner;
public class Q_29 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
	char c[]=s.toCharArray();
	String str[]=new String[c.length];
	for (int i = 0; i < c.length; i++) {
		str[i]=String.valueOf(c[i]);
	}
	ArrayList<String>list=new ArrayList<String>(Arrays.asList(str));
	int n[]=new int[str.length];
	for (int i = 0; i < str.length; i++) {
		 n[i]=Collections.frequency(list,str[i]);
		 
	}
	int g=maximum_occur(n);
	System.out.println();
	System.out.println("This Character has Highest Occurance ==> "+list.get(g));
	}

	private static int maximum_occur(int[] n) {
		int max=n[0];
		int index = 0;
		for (int i = 0; i < n.length; i++) {
			if(max<n[i])
			{
				max=n[i];
				index=i;
			}
		}
		return index;
	}
	

}
