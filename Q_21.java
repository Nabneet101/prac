import java.util.Scanner;
public class Q_21 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		String []a=s.split("\\s");
		String copy="";
		for (String string : a) {
			String var=string.substring(0,1).toUpperCase()+""+string.substring(1).toLowerCase();
			copy=copy+var+" ";
		}
System.out.println(copy);
	}

}
