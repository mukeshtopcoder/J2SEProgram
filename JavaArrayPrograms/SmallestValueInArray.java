// Smallest Element in Array
class SmallestValueInArray{
	public static void main(String[] args){
		int[] arr = {234,345,36,647,578,345};
		int min = arr[0];
		System.out.println("Our Array");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		for(int i=0;i<arr.length;i++)
			if(arr[i]<min)
				min=arr[i];
		System.out.println("\nSmallest Value : "+min);
	}
}