//Program to display HashTable content
import java.util.Hashtable;
class ImplementHashTable{
	public static void main(String[] args){
		Hashtable<String,Integer> ht = new Hashtable<>();
		ht.put("A",65);
		ht.put("B",66);
		ht.put("C",67);
		ht.put("D",68);
		System.out.println("HashTable : "+ht);
		System.out.println("Key : A , Value : "+ht.get("A"));
		ht.remove("C");
		System.out.println("Updated HashTable : "+ht);
	}
}