import java.util.*;
class FibonacciSeries{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 1;
		int c;
		System.out.print("Enter Range For Series : ");
		int range = sc.nextInt();
		if(range>1)
			System.out.print(a+" "+b);
		else
			System.out.print("Please Enter Range Greater Than 1;
		for(int i=1;i<=range-2;i++){
			c = a+b;
			System.out.print(" "+c);
			a = b;
			b = c;
		}
	}
}