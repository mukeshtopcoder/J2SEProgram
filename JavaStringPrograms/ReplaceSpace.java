// Replace Space With A Special Character
// Example Aman Kumar : Aman$Kumar
class ReplaceSpace{
	public static void main(String[] args){
		String str = "Hello India Hello World";
		StringBuffer sb = new StringBuffer(str);
		for(int i=0;i<sb.length();i++)
			if(sb.charAt(i)==' ')
				sb.setCharAt(i,'#');
		str = sb.toString();
		System.out.print("Replaced String : "+str);
	}
}