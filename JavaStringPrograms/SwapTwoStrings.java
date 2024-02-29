// Swap Two Strings Without Using Third Variable
class SwapTwoStrings{
	public static void main(String[] args){
		String str1 = "Hello India";
		String str2 = "Hello World";
		System.out.println("String 1 : "+str1);
		System.out.println("String 2 : "+str2);
		str1 = str1+str2;
		str2 = str1.substring(0,str2.length());
		str1 = str1.substring(str2.length());
		System.out.print("After Swapping\n");
		System.out.println("String 1 : "+str1);
		System.out.println("String 2 : "+str2);
	}
}