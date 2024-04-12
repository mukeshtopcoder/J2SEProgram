//Write a Java program to Decimal to Binary Conversion
import java.util.Stack;
import java.util.Scanner;
class DecimalToBinary{
	public static void main(String[] args){
		Stack<Integer> st = new Stack<>();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A Decimal Number : ");
		int num = sc.nextInt();
		String binary = "";
		for(int i=0;i<num;num=num/2)
			st.push(num%2);
		while(0<st.size())
			binary=binary+st.pop();
		System.out.println("Binary Number : "+binary);
	}
}