//Write a Java program to create a Stack collection of objects of a class
import java.util.Stack;
class StoreClassObjects{
	public static void main(String[] args){
		Stack<Emp> st = new Stack<>();
		Emp emp1 = new Emp("Rahul",101);
		Emp emp2 = new Emp("Shivam",102);
		Emp emp3 = new Emp("Mahesh",103);
		st.add(emp1);
		st.add(emp2);
		st.add(emp3);
		int num = 1;
		for(Emp emp : st)
		{
			System.out.println("Employee "+num+" Details");
			System.out.println("ID : "+emp.name);
			System.out.println("Name : "+emp.id);
			num++;
		}
	}
}
class Emp{
	String name;
	int id;
	Emp(String name,int id){
		this.id=id;
		this.name=name;
	}
}