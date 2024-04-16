//Write a Java program to remove all of the elements from a hash set
import java.util.HashSet;
class RemoveAllElements{
	public static void main(String[] args){
		HashSet<Integer> hs = new HashSet<>();
		hs.add(23);
		hs.add(78);
		hs.add(36);
		hs.add(54);
		hs.add(27);
		hs.add(85);
		System.out.println("Our HashSet : "+hs);
		hs.clear();
		System.out.println("Our Elements Removed HashSet : "+hs);
	}
}