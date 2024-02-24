// Subset of a String
class SubsetOfString{
	public static void main(String[] args){
		String str = "MUKESH";
		System.out.println("Your String : "+str);
		System.out.println("Subset Of Strings Are...");
		int m;
		for(int j=0;j<str.length();j++){
			for(int k=0;k<str.length();k++){
				for(m=k;m<=(k+j);m++)
					if((m<str.length()))	 	 	
						System.out.print(str.charAt(m));
				System.out.println();
				if(m==str.length())
					break;
			}
		}
	}
}