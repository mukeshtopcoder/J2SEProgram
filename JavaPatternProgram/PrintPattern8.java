/*
Print Pattern
0
909
89098
7890987
678909876
56789098765
4567890987654
345678909876543
23456789098765432
1234567890987654321
*/
class PrintPattern8{
	public static void main(String[] args){
		for(int i=10;i>=1;i--){
			for(int k=i;k<10;k++)
				System.out.print(k);
			System.out.print(0);
			for(int k=9;k>=i;k--)
				System.out.print(k);
			System.out.println();
		}
	}
}