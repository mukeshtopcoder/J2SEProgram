// Subtract Two Matrix
class SubtractTwoMatrix{
	public static void main(String[] args){
		int[][] matrix1 = {{23,45,63},
							 {54,32,67},
								{45,73,98}};
		int[][] matrix2 = {{12,23,23},
							 {12,13,34},
								{12,13,12}};
		System.out.println("Our Matrix1");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(matrix1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("\nOur Matrix2");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(matrix2[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("\nSubtraction Of Two Matrix");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(matrix1[i][j]-matrix2[i][j]+" ");
			}
			System.out.println();
		}
	}
}