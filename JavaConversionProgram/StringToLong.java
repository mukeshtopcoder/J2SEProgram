// Conversion From String To Long
class StringToLong{
	public static void main(String[] args){
		String str = "1230";
		System.out.println("Our String : "+str);
		long num = Long.parseLong(str);
		System.out.print("Long : "+num);
	}
}