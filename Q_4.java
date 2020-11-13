import java.util.*;
import java.util.Scanner;

public class Q_4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s1=sc.nextLine();
		char[] a=s1.toCharArray();
		String[] b=new String[a.length];
		for (int i = 0; i < a.length; i++) {
			int c=0;
			for (int j = 0; j < a.length; j++) {
				if(a[i]==a[j])
				{
					c++;
				}
			}
		   b[i]=a[i]+" is present==> "+c+" times";
		}
		List<String> list=new ArrayList<>(Arrays.asList(b));
		HashSet<String>set=new HashSet<String>(list);
		for (String string : set) {
			System.out.println(string);
		}
	}

	}

