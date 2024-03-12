// Character To String
class CharToString{
	public static void main(String[] args){
		char[] ch = {'A','B','H','I','S','H','E','K'};
		System.out.print("Characters : ");
		String str = "";
		for(int i=0;i<ch.length;i++){
			System.out.print(ch[i]+" ");
			str=str+ch[i];
		}
		System.out.print("\nString : "+str);
	}
}