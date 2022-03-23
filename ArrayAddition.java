import java.util.*;
class ArrayAddition
{
	public static void main(String[] args)
	{
		int a[][]=new int[10][10],b[][]=new int[10][10],c[][]=new int[10][10],n,m,i,j;
		Scanner s1=new Scanner(System.in);
		System.out.print("enter the size of row:");
		m=s1.nextInt();
		System.out.print("enter the size of columns:");
		n=s1.nextInt();
		System.out.println("enter the elements in first matrix:");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				a[i][j]=s1.nextInt();
			}
		}
		System.out.println("enter the elements of second matrix:");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				b[i][j]=s1.nextInt();
			}
		}

		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.println("display the matrix after addition");
	        for(i=0;i<m;i++)
	        {

		       System.out.println(" ");
	               for(j=0;j<n;j++)
	               {
	                        System.out.print("\t"+c[i][j]);		
	               }
	
	       }
	}
}

