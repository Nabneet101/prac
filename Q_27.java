
public class Q_27 {
	public static void main(String[] args) {
		String a="abc";
		String b="def";
		String c="";//dabecf
		if(a.length()!=b.length())
		{
			System.out.println("this may not be a valid shuffle");
			System.exit(0);
		}
			int s=-1;
		for (int i = 0; i < a.length(); i++)
		{
			
			if(i%2==0)
			{
				s++;
				c=c+b.charAt(s);
			}
				c=c+a.charAt(i);
				
			
		}
		System.out.println("This is a valid Shuffle ==> "+c+""+b.charAt(b.length()-1));
	}

}
