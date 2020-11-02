import java.util.*;
public class String_Repeat {
	public static void main(String[] args) {
		String a[]= {"nabneet","abhilash","chandan","sumit","nabneet","abhilash","iswar","nabneet"};
		String b[]=new String[a.length];
		try {
			for (int i = 0; i < a.length; i++) {
				int c=0;
				for (int j = 0; j < a.length; j++) {
					if(a[i]==a[j])
					{
						c++;
					}
				}
			   b[i]=a[i]+" is present==> "+c+" times";
			}
			List<String> list=new ArrayList<>(Arrays.asList(b));
			Set<String> set=new HashSet<>(list);
			for (String string : set) {
				System.out.println(string);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
