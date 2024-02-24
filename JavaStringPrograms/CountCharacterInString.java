// Count Character in String 
class CountCharacterInString{
	public static void main(String[] args){
		String str = "Hello My Name is Mukesh";
		System.out.println("Your String : "+str);
		int count=0;
		for(int i=0;i<str.length();i++)
			if(str.charAt(i)!=' ')
				count++;
		System.out.print("Total Character : "+count);
	}
}