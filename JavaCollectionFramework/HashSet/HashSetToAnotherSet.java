//Write a Java program to clone a hash set to another hash set
import java.util.HashSet;
class HashSetToAnotherSet{
	public static void main(String[] args){
		HashSet<Integer> hs1 = new HashSet<>();
		hs1.add(23);
		hs1.add(67);
		hs1.add(63);
		hs1.add(54);
		hs1.add(68);
		hs1.add(25);
		HashSet hs2 = (HashSet)hs1.clone();
		System.out.println("HashSet1 : "+hs1);
		System.out.println("HashSet2 : "+hs2);
	}
}