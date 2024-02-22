// 3rd Largest Number in Array
// We are going to sort array after that we can find all the values in any order
// Sort The Elements In Descending Order First
class LargestNumber3rd{
	public static void main(String[] args){
		int[] arr = {23,5,56,67,54,65,53,45,2,4};
		System.out.println("Our Array");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				if(arr[i]>arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("\nSorted Array In Descending Order");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		System.out.println("\n3rd Largest : "+arr[2]);
		System.out.println("2nd Largest : "+arr[1]);
		System.out.println("Largest : "+arr[0]);
	}
}