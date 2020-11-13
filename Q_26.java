
public class Q_26 {
public static void main(String[] args) {
	String s="NABNEET";
	System.out.println("String is ==>"+s);
	s=s.toLowerCase();
	char c[]=s.toCharArray();
	int vow=0,con=0;
		for (char d : c) 
	{
		if(d=='a'||d=='e'||d=='i'||d=='o'||d=='u')
		{
			vow++;
		}
		else
		{
			con++;
		}
		
	}
		System.out.println("No of vowels are ==>"+vow+" No of consonents are==>"+con);
}
}

	
	


