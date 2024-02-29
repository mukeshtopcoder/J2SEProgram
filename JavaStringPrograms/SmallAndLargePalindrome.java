// Find Smallest And Largest Possible Palindrome Words in a String
class SmallAndLargePalindrome{
	public static boolean Palindrome(String s){
		int start = 0;
		int end = s.length()-1;
		while(start<end){
			if(s.charAt(start)!=s.charAt(end))
				return false;
			start++;
			end--;
		}
		return true;
	}
	public static void main(String[] args){
		String str = "naman says wow to madam nooroon";
		System.out.println("String : "+str);
		String[] arr = str.split(" ");
		String[] pali = new String[arr.length];
		int m=0;
		for(int i=0;i<arr.length;i++){
			if(Palindrome(arr[i])){
				pali[m]=arr[i];
				m++;
			}
		}
		if(m>0){
			String max=pali[0];
			String min=pali[0];
			for(int i=0;i<m;i++){
				if(max.length()<pali[i].length())
					max=pali[i];
				if(min.length()>pali[i].length())
					min=pali[i];
			}
			System.out.println("Maximum Palindrome : "+max);
			System.out.println("Minimum Palindrome : "+min);
		}else{
			System.out.print("Not Found Any Palindrome Word");
		}
	}
}