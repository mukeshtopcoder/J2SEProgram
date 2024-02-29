// Reverse String Word By Word
class ReverseStringByWord{
	public static void main(String[] args){
		String str = "Hello Everyone I Am Mukesh";
		System.out.println("String : "+str);
		String[] arr = str.split(" ");
		StringBuffer sb = new StringBuffer();
		for(int i=arr.length-1;i>=0;i--){
			sb=sb.append(arr[i]);
			if(i>0)
				sb.append(" ");
		}
		str = sb.toString();
		System.out.println("Reversed String : "+str);
	}
}