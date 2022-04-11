class circlearea
{
	int radius;
	circlearea(int r)
	{
	
		radius=r;
	}
 	void cal_circlearea()
	{
		double area;
		area=3.14*(radius*radius);
		System.out.println("area of circle is:"+area);
	}
}
class carea
{
	public static void main(String args[])
	{
		circlearea p1=new circlearea(2);
		p1.cal_circlearea();
		
	}
}
