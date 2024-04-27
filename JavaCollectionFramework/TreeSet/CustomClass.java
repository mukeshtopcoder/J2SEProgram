//Custom Class
import java.util.TreeSet;
class Emp implements Comparable<Emp>{
	int id;
	String name;
	int salary;
	static String cname = "Google";
	Emp(int id,String name,int salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public int compareTo(Emp other){
		return Integer.compare(this.id,other.id);
	}
}
class CustomClass{
	public static void main(String[] args){
		TreeSet<Emp> ts = new TreeSet<>();
		Emp emp1 = new Emp(101,"Rohan",28365);
		Emp emp2 = new Emp(102,"Mohan",81357);
		Emp emp3 = new Emp(103,"Sohan",74590);
		ts.add(emp1);
		ts.add(emp2);
		ts.add(emp3);
		for(Emp emp : ts){
			System.out.println("ID : "+emp.id);
			System.out.println("Name : "+emp.name);
			System.out.println("Salary : "+emp.salary);
			System.out.println("Cname : "+emp.cname);
		}
	}
}