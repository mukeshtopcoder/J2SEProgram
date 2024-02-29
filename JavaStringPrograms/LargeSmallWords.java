// Largest And Smallest Words In A String
class LargeSmallWords{
	public static void main(String[] args){
		String str = "Aman is good boy and handsome";
		String[] arr = str.split(" ");
		int max,min,maxindex=0,minindex=0;
		max=min=arr[0].length();
		for(int i=0;i<arr.length;i++){
			if(max<arr[i].length()){
				max=arr[i].length();
				maxindex=i;
			}
			if(min>arr[i].length()){
				min=arr[i].length();
				minindex=i;
			}
		}
		System.out.println("My String : "+str);
		System.out.println("Maximum Length Word : "+arr[maxindex]);
		System.out.println("Minimum Length Word : "+arr[minindex]);
	}
}