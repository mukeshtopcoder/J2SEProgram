// Largest Element in Array
class LargestValueInArray{
	public static void main(String[] args){
		int[] arr = {234,345,36,647,578,345};
		int max = arr[0];
		System.out.println("Our Array");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		for(int i=0;i<arr.length;i++)
			if(arr[i]>max)
				max=arr[i];
		System.out.println("\nLargest Value : "+max);
	}
}