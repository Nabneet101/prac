import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		String s=sc.nextLine();
		//first methord
		if(s.contains("Mrs."))
		{
			s=s.replace("Mrs.","");
		}
		if(s.contains("Mr."))
		{
			s=s.replace("Mr.","");
		}
		System.out.println(s.trim());
		
		//second methord
		/*
		 * String s1[]=s.split("\\s"); ArrayList<String> arrays=new
		 * ArrayList<String>(Arrays.asList(s1));
		 * if(arrays.contains("Mr.")||arrays.contains("Mrs.")); arrays.remove(0); String
		 * p[]=arrays.toArray(new String[arrays.size()]); String name=""; for (int i =
		 * 0; i < p.length; i++) { name=name+p[i]+" "; } System.out.println(name);
		 */
		
	}
	
}
