import java.util.*;
class userinput
{
	public static void main(String[] args)
	{
		int a,b,c;
                Scanner s1=new Scanner(System.in);
		System.out.println("enter the first number");
                a=s1.nextInt();
		System.out.println("enter the second number");
                b=s1.nextInt();
		c=a+b;
		System.out.println("the result of:"+a+"+"+b+"="+c);


	}
}