import java.util.*;
class Array
{
	public static void main(String[] args)
	{
		int a[]=new int[5],i;
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the elements");
		for(i=0;i<5;i++)
		{
			a[i]=s1.nextInt();
		}
	System.out.println("the array is");
	for(i=0;i<5;i++)
		System.out.print("\t"+a[i]);
		
	}
}