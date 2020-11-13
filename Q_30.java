
/*public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("how many String you want to enter");
	int n=sc.nextInt();
	sc.nextLine();
	String s[]=new String[n];
	for (int i = 0; i < s.length; i++) {
		s[i]=sc.nextLine();
	}*/

import java.util.*; 

class Q_30
{ 
  
static void sort(String []s, int n) 
{ 
    for (int i=1 ;i<n; i++) 
    { 
        String temp = s[i]; 
  
         
        int j = i - 1; 
        while (j >= 0 && temp.length() < s[j].length()) 
        { 
            s[j+1] = s[j]; 
            j--; 
        } 
        s[j+1] = temp; 
    } 
} 
static void printArraystring(String str[], int n) 
{ 
    for (int i=0; i<n; i++) 
        System.out.print(str[i]+" "); 
} 
  
public static void main(String args[]) 
{ 
   Scanner sc=new Scanner(System.in);
   System.out.println("How many string you want to enter");
   int l=sc.nextInt();
   String arr[]=new String[l];
   sc.nextLine();
   System.out.println("enter "+l+" strings");
   for (int i = 0; i < arr.length; i++) {
	   arr[i]=sc.nextLine();
}
    int n = arr.length; 
    sort(arr,n); 
    printArraystring(arr, n); 
      
} 
} 

