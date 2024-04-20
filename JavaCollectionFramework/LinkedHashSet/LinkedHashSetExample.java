//Example of LinkedHashSet
import java.util.LinkedHashSet;
class LinkedHashSetExample{
	public static void main(String[] args){
		LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
		lhs.add(23);
		lhs.add(87);
		lhs.add(74);
		lhs.add(72);
		lhs.add(56);
		lhs.add(91);
		lhs.add(27);
		lhs.add(59);
		lhs.add(35);
		System.out.println("LinkedHashSet : "+lhs);
	}
}