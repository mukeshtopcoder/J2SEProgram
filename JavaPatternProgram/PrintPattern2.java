/*
Print This Pattern
5432*
543*1
54*21
5*321
*4321
*/
class PrintPattern2{
	public static void main(String[] args){
		for(int i=1;i<6;i++){
			for(int j=5;j>0;j--){
				if(j==i)
					System.out.print("*");
				else
					System.out.print(j);
			}
			System.out.println();
		}
	}
}