/*
Print This Pattern
1	2	3	4	5
16					6
15					7
14					8
13	12	11	10	9
*/
class PrintPattern6{
	public static void main(String[] args){
		int m=1;
		int n=16;
		for(int i=1;i<=4;i++){
			if(m<5)
				for(int j=1;j<=5;j++)
					System.out.print((m++)+"  ");
				System.out.println();
			if(n>13)
				System.out.print((n--)+"            "+(m++));
			else
				for(int k=1;k<=5;k++)
					System.out.print((n--)+" ");
		}
	}
}