// Check Two Strings Are Anagram
class AnagramStrings{
	public static void main(String[] args){
		String str1 = "LISTEN";
		String str2 = "SILENT";
		if(str1.length()==str2.length()){
			StringBuffer sb = new StringBuffer(str1);
			int count=0;
			for(int i=0;i<str2.length();i++){
				for(int j=0;j<str2.length();j++){
					if(sb.charAt(j)==str2.charAt(i)){
						sb.setCharAt(j,'*');
						count++;
						break;
					}
				}
			}
			if(str2.length()==count)
				System.out.print("Anagram String");
			else
				System.out.print("Not Anagram Number");
		}else{
			System.out.print("Strings Are Different");
		}
	}
}