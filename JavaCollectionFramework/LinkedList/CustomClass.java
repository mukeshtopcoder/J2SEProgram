//Custom Class
import java.util.LinkedList;
class Emp{
	int id;
	String name;
	int Salary;
	static String cname="Google";
	Emp(int id,String name,int Salary){
		this.id=id;
		this.name=name;
		this.Salary=Salary;
	}
}
class CustomClass{
	public static void main(String[] args){
		LinkedList<Emp> li = new LinkedList<>();
		Emp emp1 = new Emp(101,"Rahul",72682);
		Emp emp2 = new Emp(102,"Mohan",26539);
		Emp emp3 = new Emp(103,"Siya",62484);
		li.add(emp1);
		li.add(emp2);
		li.add(emp3);
		for(Emp emp : li){
			System.out.println("ID : "+emp.id);
			System.out.println("Name : "+emp.name);
			System.out.println("Salary : "+emp.Salary);
			System.out.println("Cname : "+emp.cname);
		}
	}
}