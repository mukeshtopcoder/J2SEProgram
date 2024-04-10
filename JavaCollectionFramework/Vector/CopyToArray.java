//Write a Java program to copy elements of Vector collection into an array
import java.util.Vector;
class CopyToArray{
	public static void main(String[] args){
		Vector<Integer> vc = new Vector<>();
		vc.add(23);
		vc.add(78);
		vc.add(64);
		vc.add(73);
		vc.add(74);
		int[] arr = new int[vc.size()];
		System.out.println("Our Vector : "+vc);
		for(int i=0;i<vc.size();i++)
			arr[i]=vc.get(i);
		System.out.println("Vector Copied To Array...");
		System.out.print("Array Items : ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}
}