// let String = helloindiahelloworld
// In this String 'hello' is longest repeating String
class LongestRepeatingString{
	public static String LongString(String s,String r){
		int len = Math.min(s.length(),r.length());
		for(int i=0;i<len;i++){
			if(s.charAt(i)!=r.charAt(i))
				return s.substring(0,i);
		}
		return s.substring(0,len);
	}
	public static void main(String[] args){
		String str = "amanismybrotheramanisagoodboy";
		String lrs = "";
		int l = str.length();
		for(int i=0;i<l;i++){
			String temp = LongString(str.substring(0,l),str.substring(i+1,l));
			if(temp.length()>lrs.length())
				lrs = temp;
		}
		System.out.print("Longest String : "+lrs);
	}
}