import java.util.*;
class Tarray
{
	public static void main(String[] args)
	{
		int a[][]=new int[2][3],i,j;
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the elements");
		for(i=0;i<2;i++)
		{
			for(j=0;j<3;j++)
			{
				
			a[i][j]=s1.nextInt();
			}
		}
	System.out.println("display");
	for(i=0;i<2;i++)
	{

		System.out.println(" ");
	for(j=0;j<3;j++)
	{
	System.out.print("\t"+a[i][j]);		
	}
	
	}
}
}