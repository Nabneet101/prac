import java.util.Scanner;
import java.util.regex.Pattern;

public class Q_11 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		sc.close();
		String []s=str.split("\\s");
		String update="";

		for (String string : s) {
			if(Pattern.matches("\\d+",string)) {
				String v=convert(string);
				if(v==string)
				{
					System.out.println("Sorry your number is greater than 10");
				}
				update=update+v+" ";

			}
			else
				update=update+string+" ";
		}

		System.out.println(update);

	}

	private static String convert(String string) {

		int n=Integer.parseInt(string);
		if(n>11)
		{
			return string;
		}
		String []k= { "zero", "one", "two", "three", "four","five", 
				"six", "seven", "eight", "nine","Ten"};
		String g = null;
		try {
			g = k[n];
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return g;
	}
}