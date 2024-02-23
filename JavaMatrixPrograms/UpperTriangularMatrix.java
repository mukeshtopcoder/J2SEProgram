// Print Upper Triangular Matrix
/*
x	x	x	
0	x	x	
0	0	x
*/
class UpperTriangularMatrix{
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
			int j=0;
			for(int k=1;k<m;k++){
			System.out.printf("%2d ",0);
			j=j+1;
			}
			for(;j<3;j++){
				System.out.print(matrix[i][j]+" ");
			}
			m=m+1;
			System.out.println();
		}
	}
}