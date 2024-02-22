// Copy All Elements from one Array to Another Array
class CopyElementsOfArray{
	public static void main(String[] args){
		int[] arr1 = {23,45,67,34,65,7,43,32,54,23};
		int[] arr2 = new int[10];
		for(int i=0;i<arr1.length;i++)
			arr2[i]=arr1[i];
		for(int i=0;i<arr1.length;i++)
			System.out.print(arr2[i]+" ");
	}
}