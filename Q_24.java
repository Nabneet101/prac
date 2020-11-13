import java.util.Scanner;

public class Q_24 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("What should be the size of the string");
		int n=sc.nextInt();
		int num[]=new int[n];
		int s=0;
		while(s!=7)
		{
		for (int i = 0; i < num.length; i++) {
			num[i]=65+(int)(Math.random()*(90-65));
		}
		String m="";
		for (int i : num) {
			m=m+(char)i;
		}
System.out.println(m);
s++;
		}
	}

}
