/*
Print Pattern
1 1 1 1 1 1 1 1 1 1
1                 1
1                 1
1                 1
1                 1
1                 1
1                 1
1                 1
1                 1
1 1 1 1 1 1 1 1 1 1
*/
class PrintPattern11{
	public static void main(String[] args){
		int i=0;
		for(i=1;i<=10;i++)
			System.out.print(1+" ");
		System.out.println();
		for(int k=1;k<=8;k++){
			for(i=1;i<=10;i++){
				if((i==1)||(i==10))
					System.out.print(1+" ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		for(i=1;i<=10;i++)
			System.out.print(1+" ");
	}
}