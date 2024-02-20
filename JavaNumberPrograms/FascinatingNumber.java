// Number : 192
// If 192*1 , 192*2 , 192*3
// By Concatenate it : 192384576 
// This final Number has 0-9 All Numbers
// So 192 is a Fascinating Number
import java.util.Scanner;
class FascinatingNumber{
	public static boolean Fasci(int num){
		String str = ""+num*1+num*2+num*3;
		int count = 0;
		for(int i=0;i<str.length();i++){
			for(int j=49;j<=57;j++){
				if((int)str.charAt(i)==j){
					count++;
					break;
				}
			}
		}
		if(count==9)
			return true;
		return false;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A Number : ");
		int n = sc.nextInt();
		boolean result = FascinatingNumber.Fasci(n);
		if(result)
			System.out.print("Fascinating Number");
		else
			System.out.print("Not Fascinating");
	}
}