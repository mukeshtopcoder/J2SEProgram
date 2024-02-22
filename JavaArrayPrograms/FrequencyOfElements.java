// Frequency of Each Element in Array
class FrequencyOfElements{
	public static void main(String[] args){
		int[] arr = {23,34,6,4,6,23,23,34,23,4};
		for(int i=0;i<arr.length;i++){
			int count=0;
			int num=arr[i];
			if(arr[i]!=(-1)){
				for(int j=0;j<arr.length;j++){
					if(num==arr[j]){
						count++;
						arr[j]=-1;
					}
				}
			}
			if(num!=(-1))
				System.out.println("Frequency of "+num+" is : "+count);
		}
	}
}