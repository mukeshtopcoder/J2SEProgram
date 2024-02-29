// Reverse A String
class ReverseString{
	public static void main(String[] args){
		String str = "HELLO WORLD";
		StringBuffer sb = new StringBuffer();
		for(int i=str.length()-1;i>=0;i--){
			sb.append(str.charAt(i));
		}
		str = sb.toString();
		System.out.print("Reverse String : "+str);
	}
}