// Sum of Each Column and Each Row in a Column
/*
00	01	02	
10	11	12	
20	21	22
*/
class SumOfEachRowAndColumn{
	public static void main(String[] args){
		int[][] matrix = {{2,4,4},
							{2,5,7},
								{4,7,5}};
		System.out.println("Your 3X3 Matrix");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.printf("%2d ",matrix[i][j]);
			}
			System.out.println();
		}
		for(int i=0;i<3;i++){
			int row=0;
			int col=0;
			for(int j=0;j<3;j++){
				row=row+matrix[i][j];
				col=col+matrix[j][i];
			}
			System.out.println((i+1)+" Row "+row);
			System.out.println((i+1)+" Column "+col);
		}
	}
}