//Write a Java program to convert a hash set to a List/ArrayList
import java.util.HashSet;
import java.util.ArrayList;
class ConvertToArrayList{
	public static void main(String[] args){
		HashSet<Integer> hs = new HashSet<>();
		hs.add(42);
		hs.add(36);
		hs.add(56);
		hs.add(62);
		hs.add(18);
		hs.add(36);
		hs.add(58);
		System.out.println("HashSet : "+hs);
		ArrayList<Integer> list = new ArrayList<>(hs);
		System.out.println("Converted To ArrayList : "+list);
	}
}