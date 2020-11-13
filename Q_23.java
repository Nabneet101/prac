import java.util.*;
public class Q_23 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		String var="";
		String upper="";
		for (int i = 0; i <s.length(); i++) {
			if(Character.isUpperCase(s.charAt(i)))
			{
				upper=upper+s.charAt(i);
			}
			else
			{
				var=var+s.charAt(i);
			}
		}
		var=var+upper;
		System.out.println(var);

	}

}
