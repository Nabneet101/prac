
public class spliting_string {
	public static void main(String[] args) {
		String name="Nabneet Raj Pattnaik";
		String s1[]=name.split("\\s");
		System.out.println(s1.length);
		for (int i = 0; i < s1.length; i++) {
		System.out.println(s1[i]);	
		}
	}

}
