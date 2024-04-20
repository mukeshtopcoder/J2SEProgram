//Convert A HashSet to a TreeSet
import java.util.HashSet;
import java.util.TreeSet;
class HashSetToTreeSet{
	public static void main(String[] args){
		HashSet<Integer> hs = new HashSet<>();
		hs.add(23);
		hs.add(43);
		hs.add(87);
		hs.add(35);
		hs.add(16);
		hs.add(46);
		hs.add(86);
		System.out.println("HashSet : "+hs);
		TreeSet<Integer> ts = new TreeSet<>(hs);
		System.out.println("Converted To\nTreeSet : "+ts);
	}
}