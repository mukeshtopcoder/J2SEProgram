// Frequency Of Each Character
class FrequencyOfEachCharacter{
	public static void main(String[] args){
		String str = "aman is a good boy aman is my bro";
		StringBuffer sb = new StringBuffer(str);
		for(int i=0;i<str.length();i++){
			int count=1;
			for(int j=i+1;j<str.length();j++){
				if((str.charAt(i)==sb.charAt(j))&&(sb.charAt(i)!='0')&&(sb.charAt(i)!=' ')){
					sb.setCharAt(j,'0');
					count++;
				}
			}
			if((sb.charAt(i)!='0')&&(sb.charAt(i)!=' ')){
				System.out.println("Frequency of "+str.charAt(i)+" is "+count);
			}
		}
	}
}