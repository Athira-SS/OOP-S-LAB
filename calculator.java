import java.util.*;
class calculator
{
	public static void main(String[] args)
	{
		int a,b,c;
		String ch;
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the first number");
      		a=s1.nextInt();
		System.out.println("enter the second number");
      		b=s1.nextInt();
		System.out.println("enter your choice");
		ch=s1.nextLine();
		System.out.println("+.addition\n-.subtraction\n*.multiplication\n/.division");
		ch=s1.nextLine();
		switch(ch)
		{
			case "+":
				c=a+b;
				System.out.println("Sum:"+a+"+"+b+"="+c);
				break;
			case "-":
		                c=a-b;
				System.out.println("Difference:"+a+"-"+b+"="+c);
				break;
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
			case "*":
				c=a*b;
				System.out.println("Product:"+a+"*"+b+"="+c);
				break;
			case "/":
				c=a/b;
				System.out.println("Quationt:"+a+"/"+b+"="+c);
				break;
			default: 
				System.out.println(" ");
				break;
		}
	}
} 
		                        