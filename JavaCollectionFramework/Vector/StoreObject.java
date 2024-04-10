//Write a Java program to create a vector to store objects of a class
import java.util.Vector;
class StoreObject{
	public static void main(String[] args){
		Vector<Emp> vc =new Vector<>();
		Emp emp1 = new Emp(101,"Rahul");
		Emp emp2 = new Emp(102,"Abhishek");
		Emp emp3 = new Emp(103,"Shiva");
		vc.add(emp1);
		vc.add(emp2);
		vc.add(emp3);
		for(Emp emp : vc)
		{
			System.out.println("Employee ID : "+emp.id);
			System.out.println("Employee Name : "+emp.name);
		}
	}
}
class Emp{
	int id;
	String name;
	Emp(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
}