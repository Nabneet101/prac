import java.util.*;
public class Q_18 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.nextLine();
		sc.close();
		char []s1=s.toCharArray();
		String g[]=new String[s1.length];
		for (int i = 0; i < g.length; i++) {
			g[i]=String.valueOf(s1[i]);

		}
		int []j1=new int[g.length];
		
		String[] k=new String[g.length];
	
		int n=0;
		for (int i = 0; i < g.length; i++) 
		{
			int c=0; String copy="";
			for (int j = i; j < g.length; j++) 
			{

				if(copy.contains(g[j])) 
				{ 

					break;
				}
				else 
				{
					copy=copy+g[j]; 
					c=c+1;
				} 

			}
			j1[i]=copy.length();
			k[i]=copy;
		
			
		}
		 n=pun(j1);
		System.out.println("largest substring is ==> "+k[n]);
	}

	private static int pun(int[] j1) {
		int max = j1[0];
		int index = 0;

		for (int i = 0; i < j1.length; i++) 
		{
			if (max < j1[i]) 
			{
				max = j1[i];
				index = i;
			}
		}
		return index;
	}
	
}
