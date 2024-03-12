/*
Print Pattern
A
BB
CCC
DDDD
EEEEE
*/
class PrintPattern10{
	public static void main(String[] args){
		for(int i=65;i<70;i++){
			for(int j=65;j<=i;j++)
				System.out.print((char)i);
			System.out.println();
		}
	}
}