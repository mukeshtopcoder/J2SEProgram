// Add Two Matrix
class AddTwoMatrix{
	public static void main(String[] args){
		int[][] matrix1 = {{23,45,7},
							{45,23,67},
								{34,67,43}};
		int[][] matrix2 = {{34,67,32},
							{33,32,6},
								{56,23,56}};
		System.out.println("Your 3X3 Matrix1");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(matrix1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Your 3X3 Matrix2");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(matrix2[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Addition Of Both Matrix");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print((matrix1[i][j]+matrix1[i][j])+" ");
			}
			System.out.println();
		}
	}
}