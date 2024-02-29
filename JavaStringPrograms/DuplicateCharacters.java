// Duplicate Characters In A String
import java.util.Scanner;
class DuplicateCharacters{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A String : ");
		String str = sc.next();
		StringBuffer sb = new StringBuffer(str);
		for(int i=0;i<str.length()-1;i++){
			int count=0;
			for(int j=i+1;j<str.length();j++){
				if((sb.charAt(i)==sb.charAt(j))&&(sb.charAt(i)!='0')){
					sb.setCharAt(j,'0');
					count++;
				}
			}
			if(count>0)
				System.out.println("Repeated Character : "+str.charAt(i));
		}
	}
}