//Custom Class
import java.util.LinkedHashSet;
class Emp{
	int id;
	String name;
	int salary;
	static String cname = "Google";
	Emp(int id,String name,int salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
}
class CustomClass{
	public static void main(String[] args){
		LinkedHashSet<Emp> hs = new LinkedHashSet<>();
		Emp emp1 = new Emp(101,"Rahul",54597);
		Emp emp2 = new Emp(102,"Simran",82573);
		Emp emp3 = new Emp(103,"Vinay",36872);
		hs.add(emp1);
		hs.add(emp2);
		hs.add(emp3);
		for(Emp emp : hs){
			System.out.println("ID : "+emp.id);
			System.out.println("Name : "+emp.name);
			System.out.println("Salary : "+emp.salary);
			System.out.println("Cname : "+emp.cname);
		}
	}
}