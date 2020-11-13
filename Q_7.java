import java.util.Scanner;

public class Q_7 {

	public static void main(String[] args) {
		
			Scanner sc=new Scanner(System.in);
			System.out.println("enter your name");
			String s=sc.nextLine();
			String[] name_part=s.split("\\s");
			int n=name_part.length;
			if (n==1||n==0) {
				System.out.println(s);
			}
			else if(n==2)
			{
				System.out.println(name_part[0].toUpperCase().charAt(0)+
						"."
						+name_part[1].toString().toUpperCase().charAt(0)+""
						+name_part[1].toString().substring(1));
			}
			else
			{
			System.out.println(name_part[0].toUpperCase().charAt(0)+
					"."
					+name_part[1].toUpperCase().charAt(0)+"."
					+name_part[2].toString().toUpperCase().charAt(0)+name_part[2].toString().substring(1));
			}
	}

}
