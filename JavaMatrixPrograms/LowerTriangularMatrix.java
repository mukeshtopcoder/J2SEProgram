// Print Lower Triangular Matrix
/*
x	0	0	00	01	02
x	x	0	10	11	12
x	x	x	20	21	22
*/
class LowerTriangularMatrix{
	public static void main(String[] args){
		int[][] matrix = {{34,45,56},
							{43,56,43},
								{45,34,65}};
		System.out.println("Our Matrix");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("\nlower Triangular Matrix");
		int m=1;
		for(int i=0;i<3;i++){
			for(int j=0;j<m;j++){
				System.out.print(matrix[i][j]+" ");
			}
			for(int k=3;k>m;k--)
				System.out.printf("%2d ",0);
			m=m+1;
			System.out.println();
		}
	}
}