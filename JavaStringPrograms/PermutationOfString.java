// Find All Permutation Of String
// ABC : ABC , CBA , BCA , ACB , CAB , BAC
import java.util.Scanner;
class PermutationOfString{
	public static void Permutation(char[] ar,int index){
		if(index==ar.length){
			System.out.println(ar);
			return;
		}
		for(int i=index;i<ar.length;i++){
			swap(ar,i,index);
			Permutation(ar,index+1);
			swap(ar,i,index);
		}
	}
	public static void swap(char[] ar,int i,int index){
		char temp = ar[i];
		ar[i] = ar[index];
		ar[index] = temp;
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter A String : ");
		String str = scan.next();
		Permutation(str.toCharArray(),0);
	}
}