// Number 123
//Output : One Two Three
import java.util.Scanner;
class ConvertNumberToWords{
	public static String Words(int n){
		switch(n){
			case 0: return "Zero";
			case 1: return "One";
			case 2: return "Two";
			case 3: return "Three";
			case 4: return "Four";
			case 5: return "Five";
			case 6: return "Six";
			case 7: return "Seven";
			case 8: return "Eight";
			case 9: return "Nine";
			default : return "";
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A Number : ");
		int num = sc.nextInt();
		String word="";
		for(int i=0;i<num;num=num/10){
			int rem = num%10;
			String str = ConvertNumberToWords.Words(rem);
			word = str+" "+word;
		}
		System.out.print("In Words : "+word);
	}
}