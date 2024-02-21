// Print All Even Numbers From 1 to 100
class PrintEvenNumbers{
	public static void main(String[] args){
		for(int i=1;i<=100;i++)
			if(i%2==0) // if(i%2!=0) for ODD
				System.out.print(i+" ");
	}
}