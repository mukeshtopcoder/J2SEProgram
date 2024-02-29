// Seprate Individual Character In A String
import java.util.Scanner;
class SeprateCharacter{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = "aman is amenda's son";
		StringBuffer sb =new StringBuffer(str);
		System.out.print("Enter A Character To Seprate : ");
		char ch = sc.next().charAt(0);
		for(int i=0;i<sb.length();i++){
			if(sb.charAt(i)==ch)
				sb.setCharAt(i,'$');
		}
		System.out.println("Original String : "+str);
		str=sb.toString();
		System.out.println("Updated String : "+str);
	}
}