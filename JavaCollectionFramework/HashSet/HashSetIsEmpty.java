//Write a Java program to test a hash set is empty or not
import java.util.HashSet;
class HashSetIsEmpty{
	public static void main(String[] args){
		HashSet<Integer> hs = new HashSet<>();
		hs.add(23);
		hs.add(65);
		hs.add(77);
		hs.add(57);
		hs.add(27);
		hs.add(54);
		System.out.println("HashSet : "+hs);
		hs.clear();
		System.out.println("HashSet : "+hs);
		System.out.println("Is HashSet Empty : "+hs.isEmpty());
	}
}