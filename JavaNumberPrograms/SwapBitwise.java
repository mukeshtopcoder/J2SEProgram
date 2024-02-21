// Swaping By Using Bitwise Operator ^
class SwapBitwise{
	public static void main(String[] args){
		int a = 10;
		int b = 20;
		a = a^b;	//11110 = 01010^10100
		b = a^b;	//01010 = 11110^10100
		a = a^b;	//10100 = 11110^01010
		System.out.println("Value of A : "+a);
		System.out.println("Value of B : "+b);
	}
}
