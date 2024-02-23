// Check It Is A Sparse Matrix
class CheckSparseMatrix{
	public static void main(String[] args){
		int[][] matrix = {{2,0,0},
							{0,0,0},
								{5,0,2}};
		System.out.println("Your 3X3 Matrix");
		int count=0;
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				if(matrix[i][j]==0)
					count++;
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		if(count>(matrix.length/2))
			System.out.println("Yes, Sparse Matrix");
		else
			System.out.println("Not Sparse Matrix");
	}
}