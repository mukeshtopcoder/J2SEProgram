// Count Punctuation in a String
class CountPunctuationInString{
	public static void main(String[] args){
		String str = "Hello, My UserID is MukN626@mail.com";
		int count = 0;
		for(int i=0;i<str.length();i++){
			if(!((((int)str.charAt(i)>=65)&&((int)str.charAt(i)<=90))||(((int)str.charAt(i)>=97)&&((int)str.charAt(i)<=122))||(((int)str.charAt(i)>=48)&&((int)str.charAt(i)<=57))||(str.charAt(i)==' ')))
			{
				System.out.println(str.charAt(i)+" ");
				count++;
			}
		}
		System.out.print("Total Punctuation : "+count);
	}
}