// Print Even & Odd Numbers From Array
class PrintEvenAndOddFromArray{
	public static void main(String[] args){
		int[] arr = {345,36,45,645,64,76,745};
		System.out.println("Our Array");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		System.out.println("\nEven Elements");
		for(int i=0;i<arr.length;i++)
			if(arr[i]%2==0)
				System.out.print(arr[i]+" ");
		System.out.println("\nOdd Elements");
		for(int i=0;i<arr.length;i++)
			if(arr[i]%2!=0)
				System.out.print(arr[i]+" ");
	}
}