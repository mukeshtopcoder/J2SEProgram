// Print A 3X3 Matrix
class PrintMatrix{
	public static void main(String[] args){
		int[][] matrix = {{23,34,65},
							{32,43,45},
								{56,34,45}};
		System.out.println("Your 3X3 Matrix");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
}