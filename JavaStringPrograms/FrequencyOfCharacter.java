// Find Minimum And Maximum Occurancy of a Character in a String
class FrequencyOfCharacter{
	public static void main(String[] args){
		int min,max,minc=0,maxc=0;
		String str = "amanismybroamanisagoodboy";
		char[] arr = str.toCharArray();
		int[] freq = new int[str.length()];
		for(int i=0;i<arr.length;i++){
			freq[i]=1;
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]==arr[j]){
					freq[i]++;
					arr[j]='0';
				}
			}
		}
		min=max=freq[0];
		for(int i=0;i<arr.length;i++){
			if((min>freq[i])&&(arr[i]!='0')){
				min=freq[i];
				minc=i;
			}
			if((max<freq[i])&&(arr[i]!='0')){
				min=freq[i];
				maxc=i;
			}
		}
		System.out.println("Minimum Frequency of Character '"+arr[minc]+"' is "+min);
		System.out.println("Maximum Frequency of Character '"+arr[maxc]+"' is "+max);
	}
}