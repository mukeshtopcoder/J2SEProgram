//Write a Java program to convert a hash set to an array
import java.util.HashSet;
import java.util.Iterator;
class HashSetToArray{
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
		int[] arr = new int[hs.size()];
		Iterator it = hs.iterator();
		int index=0;
		while(it.hasNext())
			arr[index++]=(int)it.next();
		System.out.print("Converted To\nArray : ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}
}