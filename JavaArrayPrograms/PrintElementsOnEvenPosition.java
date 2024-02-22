// Print Elements of An Array on Even Position
class PrintElementsOnEvenPosition{
	public static void main(String[] args){
		int[] arr = {24,34,45,77,87,89,56,78};
		System.out.println("All Elements of Array");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		System.out.println("\nElements On Even Position");
		for(int i=0;i<arr.length;i++)
			if(i%2!=0)
				System.out.print(arr[i]+" ");
	}
}