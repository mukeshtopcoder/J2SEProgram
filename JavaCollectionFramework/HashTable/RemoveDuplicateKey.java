//Program to remove duplicate key from hashtable
import java.util.Hashtable;
import java.util.Map;
import java.util.LinkedList;
class RemoveDuplicateKey{
	public static void main(String[] args){
		Hashtable<Character,Integer> ht = new Hashtable<>();
		LinkedList<Character> dub = new LinkedList<>();
		LinkedList<Character> uni = new LinkedList<>();
		ht.put('A',23);
		ht.put('B',43);
		ht.put('C',56);
		ht.put('D',36);
		ht.put('C',29);
		ht.put('E',45);
		System.out.println("HashTable : "+ht);
		for(Map.Entry<Character,Integer> en : ht.entrySet()){
			Character key = en.getKey();
			if(uni.contains(key))
				dub.add(key);
			else
				uni.add(key);
		}
		for(int key : dub)
			ht.remove(key);
		System.out.println("Removed Dublicate Keys : "+ht);
	}
}