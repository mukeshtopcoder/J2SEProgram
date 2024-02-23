// Frequency Of Even And Odd Number In A Matrix
class FrequencyOfEvenOdd{
	public static void main(String[] args){
		int[][] matrix = {{23,56,67},
							{23,45,34},
								{34,34,56}};
		int even=0;
		int odd=0;
		System.out.println("Your 3X3 Matrix");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				if(matrix[i][j]%2==0)
					even++;
				else
					odd++;
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Frequency of Even : "+even);
		System.out.println("Frequency of odd : "+odd);
	}
}