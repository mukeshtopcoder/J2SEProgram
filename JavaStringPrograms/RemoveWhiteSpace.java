// Remove White Space From String (Space and New Line)
class RemoveWhiteSpace{
	public static void main(String[] args){
		String str = "Hello India\nHello World";
		System.out.println("My String Here\n"+str);
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<str.length();i++)
			if((str.charAt(i)!=' ')&&(str.charAt(i)!='\n'))
				sb.append(str.charAt(i));
		str = sb.toString();
		System.out.print("Now My String is : "+str);
	}
}