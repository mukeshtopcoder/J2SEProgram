// Count Vowel And Consonants In A String
class CountVowelAndConsonants{
	public static void main(String[] args){
		String str = "HELLO, MY NAME IS MUKESH!";
		int vowel=0;
		int consonants=0;
		for(int i=0;i<str.length();i++){
			if((str.charAt(i)=='A')||(str.charAt(i)=='E')||(str.charAt(i)=='I')||(str.charAt(i)=='O')||(str.charAt(i)=='U'))
				vowel++;
			else
				consonants++;
		}
		System.out.println("Total Vowels : "+vowel);
		System.out.println("Total Consonants : "+consonants);
	}
}