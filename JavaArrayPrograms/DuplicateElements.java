// Found Duplicate Elements Of An Array
class DuplicateElements{
	public static void main(String[] args){
		int[] arr = {23,4,56,45,43,56,23,45};
		System.out.println("Our Array");
		for(int i=0;i<arr.length;i++)
			System.out.print(" "+arr[i]);
		System.out.println("\nDuplicate Elements");
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]==arr[j]){
					System.out.print(" "+arr[j]);
					break;
				}
			}
		}
	}
}