//Custom Class
import java.util.Vector;
class Empl{
	int id;
	String name;
	int salary;
	static String cname = "Google";
	Empl(int id,String name,int salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
}
class CustomClass{
	public static void main(String[] args){
		Vector<Empl> vc = new Vector<>();
		Empl emp1 = new Empl(101,"Raman",27930);
		Empl emp2 = new Empl(102,"Mohan",62453);
		Empl emp3 = new Empl(103,"Sohan",87622);
		vc.add(emp1);
		vc.add(emp2);
		vc.add(emp3);
		for(Empl emp : vc){
			System.out.println("ID : "+emp.id);
			System.out.println("Name : "+emp.name);
			System.out.println("Salary : "+emp.salary);
			System.out.println("Cname : "+emp.cname);
		}
	}
}