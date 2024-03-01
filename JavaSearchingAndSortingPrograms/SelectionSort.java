//Selection Sort
class SelectionSort{
	public static void main(String[] args){
		int[] myArr = {34,7,78,89,54,43,34,56,6,34};
		System.out.println("Our Array : ");
		for(int i=0;i<myArr.length;i++)
			System.out.print(myArr[i]+" ");
		for(int i=0;i<myArr.length;i++){
			int smallest=i;
			for(int j=i;j<myArr.length;j++){
				if(myArr[smallest]>myArr[j])
					smallest=j;
			}
			int temp = myArr[i];
			myArr[i] = myArr[smallest];
			myArr[smallest] = temp;
		}
		System.out.println("\nOur Sorted Array : ");
		for(int i=0;i<myArr.length;i++)
			System.out.print(myArr[i]+" ");
	}
}