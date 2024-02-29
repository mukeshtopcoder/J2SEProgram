// Duplicate Words in a String
class DuplicateWords{
	public static void main(String[] args){
		String str = "aman is a good boy aman is my bro";
		String[] arr = str.split(" ");
		System.out.println("Repeated Words:");
		for(int i=0;i<arr.length;i++){
			int flag=0;
			for(int j=i+1;j<arr.length;j++){
				if((arr[i].equals(arr[j]))&&(!arr[j].equals("0"))){
					arr[j]="0";
					flag=1;
				}
			}
			if(flag==1)
				System.out.println(arr[i]);
		}
	}
}