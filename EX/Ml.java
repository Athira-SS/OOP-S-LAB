import java.util.Scanner;
class student
{ 
String name;
int mark;
student()
{
Scanner s= new Scanner(System.in); 
System.out.println("enter name");
name=s.next();
System.out.println("enter mark");
mark=s.nextInt();
}
}
class sports extends student
{
int score; 
sports()
{
Scanner sc= new Scanner(System.in); 
System.out.println("enter sports score"); 
score=sc.nextInt();
 }
}
class result extends sports
{
void display()
{
System.out.println("-----------------Academic Details ");
System.out.println("Name : " + name);
System.out.println("mark: " + mark);
System.out.println("--------------------SPORTS SCORE ");
System.out.println("Score : " + score);
}
}
class Ml
{
public static void main(String [] args)
{
result r=new result();
r.display();
}

}