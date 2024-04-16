//Write a Java program to compare two sets and retain elements which are same on both sets
import java.util.HashSet;
class CompareTwoSets{
	public static void main(String[] args){
		HashSet<Integer> hs1 = new HashSet<>();
		HashSet<Integer> hs2 = new HashSet<>();
		hs1.add(14);
		hs1.add(34);
		hs1.add(17);
		hs1.add(23);
		hs1.add(33);
		hs1.add(15);
		hs2.add(14);
		hs2.add(15);
		hs2.add(34);
		hs2.add(67);
		hs2.add(46);
		hs2.add(26);
		hs1.retainAll(hs2);
		System.out.println("1st Set : "+hs1);
		System.out.println("1st Set : "+hs2);
	}
}