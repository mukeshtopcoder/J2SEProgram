/*
Print This Pattern
1     1
 2   2 
  3 3 
   4
  3 3 
 2   2 
1     1
*/
class PrintPattern5{
	public static void main(String[] args){
		int m=1;
		int z=1;
		for(int i=1;i<=7;i++){
			for(int j=1;j<=4;j++){
				if(m==j)
					System.out.print(j);
				else
					System.out.print(" ");
			}
			for(int j=3;j>=1;j--){
				if(m==j)
					System.out.print(j);
				else
					System.out.print(" ");
			}
			System.out.println();
			if(m==4)
				z=-1;
			m=m+z;
		}
	}
}