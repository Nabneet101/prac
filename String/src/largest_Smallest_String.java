import java.util.*;
public class largest_Smallest_String {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();	//hello i am nabneet raj pattnaik
		System.out.println("largest word present in the string is ==> "+largest(s));
		System.out.println("smallest word present in the string is ==> "+smallest(s));
		sc.close();
	}
	private static String smallest(String s) {
		String s1[]=s.split(",|\\s");
		String shortest="               ";
		for (String string : s1) {
			if(string.length()<shortest.length())
			{
				shortest=string;
			}
		}
		return shortest;
	}

	public static String largest(String s)
	{
		String s1[]=s.split(",|\\s");
		String longest=" ";
		for (String string : s1) {
			if(string.length()>longest.length())
			{
				longest=string;
			}
		}
		return longest;
	}
}
