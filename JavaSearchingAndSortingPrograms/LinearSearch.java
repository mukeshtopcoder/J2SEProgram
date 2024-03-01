// Linear Search
import java.util.Scanner;
class LinearSearch{
	public static int Linear(int[] arr,int value){
		for(int i=0;i<arr.length;i++)
			if(arr[i]==value)
				return i;
		return -1;
	}
	public static void main(String[] args){
		int[] myArr = {34,7,78,89,54,43,34,56,6,34};
		Scanner sc = new Scanner(System.in);
		System.out.println("Our Array : ");
		for(int i=0;i<myArr.length;i++)
			System.out.print(myArr[i]+" ");
		System.out.print("\nEnter A Number To Search In Array : ");
		int key = sc.nextInt();
		int result = Linear(myArr,key);
		if(result>=0){
			System.out.print("Number Found On "+(result+1)+" Position");
		}else{
			System.out.print("Number is Not Present in Array");
		}
	}
}