import java.util.*;
class StringArray
{
public static void main(String args[])
   {
	String S;
	int n;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Array Size");
	n=sc.nextInt();
	String A[]= new String[n];
	System.out.println("Enter Elements");
	for(int i=0;i<n;i++)
		{
        	  A[i]=sc.nextLine();
        	}
	for(int i=0;i<n;i++)
    	  {
   	   System.out.print(A[i]+"  ");
    	  }
    }
}
