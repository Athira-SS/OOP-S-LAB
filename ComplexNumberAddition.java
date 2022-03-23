import java.util.*;
class ComplexNumberAddition
{
	public static void main(String[] args)
	{
		int a,ai,b,bi,c,d;
		Scanner s1=new Scanner(System.in);
		System.out.print("enter the real part of first:");
		a=s1.nextInt();
		System.out.print("enter the imaginary part of first:");
		ai=s1.nextInt();
		System.out.print("enter the real part of second:");
		b=s1.nextInt();
		System.out.print("enter the imaginary part of second:");
		bi=s1.nextInt();
		c=a+b;
		d=ai+bi;
		System.out.print("the complex number after addition is:"+c+"+"+d+"i");
	}
}
		

