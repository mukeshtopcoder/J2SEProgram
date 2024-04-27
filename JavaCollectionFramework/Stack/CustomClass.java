//Custom Class
import java.util.Stack;
class Emp{
	int id;
	String name;
	int salary;
	static String cname = "Google";
	Emp(int id,String name,int salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
}
class CustomClass{
	public static void main(String[] args){
		Stack<Emp> st = new Stack<>();
		Emp emp1 = new Emp(101,"Rahul",28352);
		Emp emp2 = new Emp(102,"Sohan",37458);
		Emp emp3 = new Emp(103,"Mohan",82366);
		st.push(emp1);
		st.push(emp2);
		st.push(emp3);
		while(st.size()>0){
			Emp emp = st.pop();
			System.out.println("ID : "+emp.id);
			System.out.println("Name : "+emp.name);
			System.out.println("Salary : "+emp.salary);
			System.out.println("Cname : "+emp.cname);
		}
	}
}