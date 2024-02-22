// Remove Duplicate Values From Array
class RemoveDuplicateValue{
	public static void main(String[] args){
		int[] arr = {34,65,67,78,78,65,67,69,78};
		int size = arr.length;
		System.out.println("Our Array");
		for(int i=0;i<size;i++)
			System.out.print(arr[i]+" ");
		for(int i=0;i<size;i++){
			for(int j=i+1;j<size;j++){
				if(arr[i]==arr[j]){
					for(int m=j;m<size-1;m++)
						arr[m]=arr[m+1];
					size=size-1;
				}
			}
		}
		System.out.println("\nDuplicate Values Removed Array");
		for(int i=0;i<size;i++)
			System.out.print(arr[i]+" ");
	}
}