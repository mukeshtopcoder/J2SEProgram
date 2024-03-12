// Convert Date To String
import java.util.Date;
import java.text.SimpleDateFormat;
class DateToString{
	public static void main(String[] args){
		Date date = new Date();
		System.out.println("Date : "+date);
		SimpleDateFormat fr = new SimpleDateFormat("yyyy-MM-dd");
		String str = fr.format(date);
		System.out.print("String : "+str);
	}
}