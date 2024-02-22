// Multiplication Of Two Matrix
class MultiplyTwoMatrix{
	public static void main(String[] args){
		int[][] matrix1 = {{7,3,7},
							{8,6,2},
								{7,4,7}};
		int[][] matrix2 = {{3,4,7},
							{8,3,7},
								{4,7,4}};
		int[][] matrix3 = new int[3][3];
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
		System.out.println("\nMultiplication Of Your Matrix");
		for(int k=0;k<3;k++){
			for(int i=0;i<3;i++){
				int m=0;
				for(int j=0;j<3;j++){
					m=m+matrix1[k][j]*matrix2[j][i];
				}
				matrix3[k][i]=m;
			}
		}
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(matrix3[i][j]+" ");
			}
			System.out.println();
		}
	}
}