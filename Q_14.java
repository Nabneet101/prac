import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Q_14 {

	public static void main(String[] args) {
	String s="gibblegabbler";
	char []g=s.toCharArray();
	String g1[]=new String[s.length()];
	
	for (int i = 0; i < g.length; i++) {
		g1[i]=String.valueOf(g[i]);
	}
	ArrayList<String> s1=new ArrayList<String>(Arrays.asList(g1));
	System.out.println(s1);
	for (String string : s1) {
		int n=Collections.frequency(s1,string);
		if(n==1)
		{
			System.out.println("first non repeative character in string is ==> "+string );
			break;
		}
	}
		
	
	
	
	
	}

}
