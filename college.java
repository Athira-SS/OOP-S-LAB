class college 
{
	static class student
	{
		int std_id;
		String name;
		student(int id,String n)
		{
			std_id=id;
			name=n;

		}

		void dis()
		{
			System.out.println("student_id :"+std_id);
			System.out.println("student name:"+name);
		}
	}
	class staff
	{
		int staff_id;
		String name;
		staff(int id,String nam)
		{
			staff_id=id;
			name=nam;
		}
		void dis()
		{
			System.out.println("staff id is:"+staff_id);
			System.out.println("staff name is:"+name);
		}
	}

public static void main(String[] args)
{
	college.student s=new college.student(21,"Athira_S_S");
	s.dis();
	college c=new college();
	college.staff S= c.new staff(12,"Malani");
	S.dis();
}
}
	
	