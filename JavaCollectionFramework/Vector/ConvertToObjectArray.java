//Write a Java program to convert a Vector collection into an Object array
import java.util.Vector;
class ConvertToObjectArray{
	public static void main(String[] args){
		Vector<Integer> vc = new Vector<>();
		vc.add(46);
		vc.add(26);
		vc.add(24);
		vc.add(62);
		vc.add(28);
		vc.add(41);
		System.out.println("Our Vector : "+vc);
		Object obj[] = new Object[vc.size()];
		for(int i=0;i<vc.size();i++)
			obj[i]=vc.get(i);
		System.out.print("Our Object : ");
		for(int i=0;i<obj.length;i++)
			System.out.print(obj[i]+" ");
	}
}