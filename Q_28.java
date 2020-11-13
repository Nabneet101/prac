import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Q_28 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string :");
		String a=sc.nextLine();
		System.out.println("Enter the string to be found:");
		String b=sc.nextLine();
		String a1[]=a.split("\\s");
		//first method
		sc.close();
		int n=find_Index(a1,b);
		if(n==-1)
		{
			System.out.println("String not found");
			System.exit(0);
		}
		System.out.println("String present at word number  ==>"+n);
		//second method
		/*
		 * Pattern p=Pattern.compile(a); Matcher m=p.matcher(b); if(m.find()) {
		 * System.out.println("Present at position==> from "+m.start()+" to"+m.end()); }
		 * else { System.out.println("incorrect"); }
		 */
	}

	private static int find_Index(String[] a1, String b1) {
		int c=-1;
		for (String string : a1)
		{
			c++;
			if(b1.equals(string))
		
				return c;
			
		}
		return -1;
	}
	
}
	
	


