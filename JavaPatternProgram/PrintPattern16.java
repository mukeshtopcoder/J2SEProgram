/*
Print Pattern
     1
	1 1
   1 2 1
  1 3 3 1
 1 4 6 4 1
1 510 105 1
*/
class PrintPattern16{
	static int Fact(int num){
		int fact=1;
		for(int m=1;m<=num;m++)
			fact=fact*m;
		return fact;
	}
	public static void main(String[] args){
		for(int i=0;i<6;i++){
			for(int j=6;j>i;j--)
				System.out.print(" ");
			for(int j=0;j<=i;j++)
				System.out.print(Fact(i)/(Fact(i-j)*Fact(j))+" ");
			System.out.println();
		}
	}
}	