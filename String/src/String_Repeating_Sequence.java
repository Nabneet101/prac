public class String_Repeating_Sequence {

	public static String lcp(String x,String y)
	{
		int n=Math.min(x.length(),y.length());
		for (int i = 0; i <n; i++) {
			if(x.charAt(i)!=y.charAt(i))
			{
				
				return x.substring(0,i);
			}
		}
		return x.substring(0,n);
	}
	public static void main(String[] args) {
		String str = "nabneetnab";
		String bla="";

		int n=str.length();
		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				System.out.println(str.substring(i,n)+"  "+str.substring(j,n));
				String x= lcp(str.substring(i,n),str.substring(j,n)); 
				if(x.length() > bla.length()) 
					bla=x;  

			}

		}
		System.out.println("Longest repeating sequence ==> "+bla);

	}



}
