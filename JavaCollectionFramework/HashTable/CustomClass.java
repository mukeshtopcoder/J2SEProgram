//Custom Class
import java.util.Hashtable;
import java.util.Enumeration;
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
		Hashtable<Integer,Emp> ht = new Hashtable<>();
		Emp emp1 = new Emp(101,"Rahul",54597);
		Emp emp2 = new Emp(102,"Simran",82573);
		Emp emp3 = new Emp(103,"Vinay",36872);
		ht.put(1,emp1);
		ht.put(2,emp2);
		ht.put(3,emp3);
		Enumeration<Emp> en = ht.elements();
		while(en.hasMoreElements()){
			Emp emp = en.nextElement();
			System.out.println("ID : "+emp.id);
			System.out.println("Name : "+emp.name);
			System.out.println("Salary : "+emp.salary);
			System.out.println("Cname : "+emp.cname);
		}
	}
}