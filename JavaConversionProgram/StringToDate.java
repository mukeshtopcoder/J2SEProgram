// String To Date
import java.text.SimpleDateFormat;
import java.util.Date;
class StringToDate{
	public static void main(String[] args){
		String str = "09/03/2024";
		System.out.println("String : "+str);
		try{
		Date date = new SimpleDateFormat("dd/MM/yyyy").parse(str);
		System.out.print("Date : "+date);
		}catch(Exception e){
			System.out.print(e);
		}
	}
}	