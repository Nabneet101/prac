import java.util.Scanner;

public class no_of_vowels {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1="";
		try {
			System.out.println("enter the string");
			s1 = sc.nextLine();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		char c[]=s1.toLowerCase().toCharArray();
		int f=0,j=0;
		for (char d : c) 
		{
			if(d=='a'||d=='e'||d=='i'||d=='o'||d=='u')
			{
				f++;
			}
			else
				j++;
		}
		System.out.println("no of vowels present are ==> "+f+"  "
				+ "and no of consonents presents are ==> "+j);
		System.out.println("length of the word ==> "+c.length);

	}

}
