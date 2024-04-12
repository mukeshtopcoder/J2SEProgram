//Write a Java program to convert a Stack collection into an Object array
import java.util.Stack;
class ConvertToObject{
	public static void main(String[] args){
		Stack<Integer> vc = new Stack<>();
		vc.add(23);
		vc.add(34);
		vc.add(56);
		vc.add(63);
		vc.add(47);
		vc.add(71);
		Object[] arr = new Object[vc.size()];
		System.out.println("Our Vector : "+vc);
		for(int i=0;i<arr.length;i++)
			arr[i]=vc.get(i);
		System.out.print("Elements of Objects : ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}
}