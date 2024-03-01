// Binary Search
import java.util.Scanner;
import java.util.Arrays;
class BinarySearch{
	public static int Binary(int[] arr,int value){
		int start = 0;
		int end = arr.length-1;
		while(start<=end){
			int mid = (start+end)/2;
			if(value==arr[mid]){
			return mid;
			}
			if(value>arr[mid])
				start=mid+1;
			else
				end=mid-1;
		}
		return -1;
	}
	public static void main(String[] args){
		int[] myArr = {34,7,78,89,54,43,34,56,6,34};
		Scanner sc = new Scanner(System.in);
		System.out.println("Our Array : ");
		for(int i=0;i<myArr.length;i++)
			System.out.print(myArr[i]+" ");
		Arrays.sort(myArr);
		System.out.print("\nOur Sorted Array : ");
		for(int i=0;i<myArr.length;i++)
			System.out.print(myArr[i]+" ");
		System.out.print("\nEnter A Number To Search In Array : ");
		int key = sc.nextInt();
		int result = Binary(myArr,key);
		if(result>=0)
			System.out.print("Number Found On "+(result+1)+" Position");
		else
			System.out.print("Number is Not Present in Array!");
	}
}