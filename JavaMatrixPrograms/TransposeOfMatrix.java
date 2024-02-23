// Transpose Of A Matrix
class TransposeOfMatrix{
	public static void main(String[] args){
		int[][] matrix = {{32,76,54},
							{87,65,43},
								{76,54,32}};
		System.out.println("Your 3X3 Matrix");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Transpose Of Matrix");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(matrix[j][i]+" ");
			}
			System.out.println();
		}
	}
}