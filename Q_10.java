import java.util.Scanner;

public class Q_10 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String");
	String document=sc.nextLine();
	System.out.println("Enter the String that needs to be replaced");
	String target=sc.nextLine();
	System.out.println("Enter the String that needs to be replaced");
	String replace=sc.nextLine();
	change(document,target,replace);
}
private static void change(String document, String target, String replace) {
	System.out.println(document.replace(target,replace));;
	
}

}
