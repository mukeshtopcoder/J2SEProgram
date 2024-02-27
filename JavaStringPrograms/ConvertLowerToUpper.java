// Convert Lower-Case Character to Upper-Case & Vice Versa
// AmanKumar = aMANkUMAR
import java.util.Scanner;
class ConvertLowerToUpper{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter A String : ");
		String str = scan.next();
		System.out.println("Converted String : ");
		for(int i=0;i<str.length();i++){
			if(((int)str.charAt(i)>64)&&((int)str.charAt(i)<91))
				System.out.print((char)((int)str.charAt(i)+32));
			else
				if(((int)str.charAt(i)>96)&&((int)str.charAt(i)<123))
				System.out.print((char)((int)str.charAt(i)-32));
				else
					System.out.print(str.charAt(i));
		}
	}
}