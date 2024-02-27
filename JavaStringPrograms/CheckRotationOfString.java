// Check one String is Rotation of Another String
// LOGIC str1+str1= ABCDABCD Check str2 present in it.
/*
String s1="this is index of example";  
//passing substring  
int index1=s1.indexOf("is");//returns the index of is substring  
int index2=s1.indexOf("index");//returns the index of index substring  
System.out.println(index1+"  "+index2);//2 8  
And It returns -1 if string is not found
*/
class CheckRotationOfString{
	public static void main(String[] args){
		String str1="ABCD", str2="CDAB";
		if(str1.length()==str2.length()){
			str1 = str1.concat(str1);
			if(str1.indexOf(str2)!=-1)
				System.out.print("1st String is Rotation of 2nd String");
			else
				System.out.print("String is Not Rotation of String");
		}else{
			System.out.print("String is not Rotation of Second String");
		}
		System.out.print(str1.indexOf(str2));
	}
}