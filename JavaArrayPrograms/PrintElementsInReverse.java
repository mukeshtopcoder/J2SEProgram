// Print Elements Of Array in Reverse
class PrintElementsInReverse{
	public static void main(String[] args){
		int[] arr = {24,34,45,77,87,89,56,78};
		System.out.println("All Elements of Array in Reverse");
		for(int i=arr.length-1;i>=0;i--)
			System.out.print(arr[i]+" ");
	}
}