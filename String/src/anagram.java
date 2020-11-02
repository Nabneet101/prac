import java.util.*;
public class anagram {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the first word");
	String first=sc.nextLine();
	System.out.println("enter the second word");
	String second=sc.nextLine();
	sc.close();
	if(anagram(first,second))
	{
		System.out.println("Anagrams");
	}
	else
		System.out.println("not Anagrams");
}
public static boolean anagram(String first, String second)
{
	if(first.length()!=second.length())
	{
		System.out.println("Not anagrams");
	}
	else
	{
		char aa[]=first.toLowerCase().toCharArray();
		char bb[]=second.toLowerCase().toCharArray();
		Arrays.sort(aa);
		Arrays.sort(bb);
		if(Arrays.equals(aa,bb))
		{
			return true;
			
		}
		else
			return false;
	}
	return true;
	
}
}
