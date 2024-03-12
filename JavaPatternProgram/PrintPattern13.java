/*
Print Pattern

*********
 *******
  *****
   ***
    *
*/
class PrintPattern13{
	public static void main(String[] args){
		int m=9;
		for(int i=1;i<=5;i++){
			for(int j=1;j<i;j++)
				System.out.print(" ");
			for(int j=1;j<=m;j++)
				System.out.print("*");
			System.out.println();
			m=m-2;
		}
	}
}