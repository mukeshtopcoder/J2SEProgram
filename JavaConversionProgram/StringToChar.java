//String To Char Conversion
class StringToChar{
	public static void main(String[] args){
		String str = "ABHISHEKCHAUHAN";
		System.out.println("String : "+str);
		char[] ch = str.toCharArray();
		System.out.print("Characters : ");
		for(int i=0;i<ch.length;i++){
			System.out.print(ch[i]+" ");
		}
	}
}