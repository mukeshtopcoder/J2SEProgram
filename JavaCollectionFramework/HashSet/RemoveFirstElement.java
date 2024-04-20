//Write a Java program to Removes first Occurrence of the element specified in the argument list from the hashset
import java.util.HashSet;
class RemoveFirstElement{
	public static void main(String[] args){
		HashSet<Integer> hs = new HashSet<>();
		hs.add(23);
		hs.add(45);
		hs.add(63);
		hs.add(26);
		hs.add(56);
		hs.add(61);
		System.out.println("HashSet : "+hs);
		hs.remove(23);
		System.out.println("HashSet : "+hs);
	}
}