/*
Print Pattern
12344321
123**321
12****21
1******1
*/
class PrintPattern7{
	public static void main(String[] args){
		int m=4;
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++)
				if(j>m)
					System.out.print("*");
				else
					System.out.print(j);
			for(int k=4;k>=1;k--)
				if(k>m)
					System.out.print("*");
				else
					System.out.print(k);
			System.out.println();
			m--;
		}
	}
}