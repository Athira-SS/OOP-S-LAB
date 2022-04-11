public class employee{
	int Record_id;
	String Name;
   	long Phone;
	String Designation;
	String Department;
	
	public employee(int r_id,String N_ame, long Pno, String desi, String dept){
		Record_id=r_id;
		Name=N_ame;
		Phone=Pno;
		Designation=desi;
		Department=dept;
	}
	void Dis(){
		System.out.println("\nRecord id : "+Record_id);
   		System.out.println("Name : "+Name);
		System.out.println("Phone Number : "+Phone);
		System.out.println("Designation : "+Designation);
		System.out.println("Department: "+Department);
	}

	public static void main(String [] args){
	employee e1= new employee(21,"AthiraSS",1234567890,"teacher","mca");
	e1.Dis();
	}
}
