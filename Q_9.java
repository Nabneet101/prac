import java.util.*;
public class Q_9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name and address");
		String name_add=sc.nextLine();
		
		address(name_add);

	}
	public static void address(String name_add) {
		String s[]=name_add.split("[,;:!?(){]");  //Nabneet raj pattnaik:An Guha lana:Sambalpur:odisha;India<world>
	for (int i = 0; i < s.length; i++) {
	System.out.println(s[i]);	
	}
				
		
	}

}
