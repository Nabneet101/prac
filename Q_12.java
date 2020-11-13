import java.util.*;
public class Q_12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		s=s.replace(" ","");
		int n=s.length();
		for (int i = 0; i < n; i++) {
		if(i%5==0 && i!=0)
		{
			System.out.print(" ");
		}
		
			System.out.print(s.charAt(i));
		}
	}

}
