//Custom Class
import java.util.HashSet;
class CustomClass{
	static class Emp{
		int id;
		String name;
		int salary;
		static String cname="Google";
		Emp(int id,String name,int salary){
			this.id=id;
			this.name=name;
			this.salary=salary;
		}
	}
	public static void main(String[] args){
		HashSet<Emp> hs = new HashSet<>();
		Emp emp1 = new Emp(101,"Rahul",76572);
		Emp emp2 = new Emp(102,"Raman",87676);
		Emp emp3 = new Emp(103,"Rihan",27376);
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