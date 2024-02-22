// Print The Sum of All The Items Of Array
class SumOfAllElements{
	public static void main(String[] args){
		int[] arr = {34,36,43,78,4,76,5,234,5};
		int sum = 0;
		System.out.println("All Elements of Array");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		for(int i=0;i<arr.length;i++)
			sum = sum+arr[i];
		System.out.println("\nSum of All Elements : "+sum);
	}
}