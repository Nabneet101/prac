import java.util.Scanner;

public class String_equa_partsS {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string");
	String s="",s1="",s2="";
	s1=sc.nextLine();
	int length=s1.length();
	if(length%2==0)
	{
		int k=length/2;
		 s=s1.substring(0,k);
		 s2=s1.substring(k);
		 System.out.println("original string is ==> "+s1+"\n"
					+"first half of the string ==>"+s+"\n"
					+"Second half of the string ==>"+s2+"\n");
	}
	else
	{System.err.println("cannot be divided into equal parts");	}
	

	}

}
