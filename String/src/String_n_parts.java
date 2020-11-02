import java.util.*;
public class String_n_parts {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.nextLine();
		System.out.println("Into how many equal parts");
		int n=sc.nextInt();
		int length=s.length();
		String s1[]=new String[length];
		String k=s;
		sc.close();
		try {
			if(length%n==0)
			{
				int i=0;
				aa:	while(true)
				{
					s1[i]=k.substring(0,n);
					i++;
					if(k.length()==n)
					{
						break aa;
					}
					k=k.substring(n);


				}
				System.out.println("the original string is ==> "+s);
				for (int j = 0; j <i; j++) {
					System.out.println(j+" ==> "+s1[j]);

				}

			}
			else
			{
				System.err.println("cannot be divided into equal parts");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

}
