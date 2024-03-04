//Insertion Sort
class InsertionSort{
	public static void main(String[] args){
		int[] arr = {231,67,434,235,45,234,3,65,76,23};
		System.out.println("Our Array!");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		for(int m=0;m<arr.length;m++){
			for(int n=m;n>0;n--){
				if(arr[n-1]>arr[n]){
					int temp = arr[n-1];
					arr[n-1]=arr[n];
					arr[n]=temp;
				}
			}
		}
		System.out.println("\nSorted Array!");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}
}