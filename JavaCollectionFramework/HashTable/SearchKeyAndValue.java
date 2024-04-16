//Program to search key & value from HashTable
import java.util.Hashtable;
import java.util.Scanner;
import java.util.Enumeration;
class SearchKeyAndValue{
	public static void main(String[] args){
		Hashtable<Character,Integer> ht = new Hashtable<>();
		Scanner sc = new Scanner(System.in);
		ht.put('A',65);
		ht.put('B',66);
		ht.put('C',67);
		ht.put('D',68);
		ht.put('E',69);
		System.out.println("HashTable : "+ht);
		System.out.print("Enter A Key(Character) : ");
		char ch = sc.next().charAt(0);
		if(ht.containsKey(ch))
			System.out.println("Key is Present");
		else
			System.out.println("Key is Not Present");
		System.out.print("Enter A Value(Integer) : ");
		int num = sc.nextInt();
		if(ht.containsValue(num))
			System.out.println("Value is Present");
		else
			System.out.println("Value is Not Present");
	}
}