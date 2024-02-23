// Check It Is A Identity Matrix
/*
1	0	0
0	1	0
0	0	1
*/
class CheckIdentityMatrix{
	public static void main(String[] args){
		int[][] matrix = {{1,0,0},
							{0,1,0},
								{0,0,1}};
		System.out.println("Your 3X3 Matrix");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		int flag = 1;
		for(int i=0;i<3;i++)
			if(matrix[i][i]!=1)
				flag=0;
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				if(i!=j)
					if(matrix[i][j]!=0)
						flag=0;
			}
		}
		if(flag==1)
			System.out.println("It is A Identical Matrix");
		else
			System.out.println("Not Identical Matrix");
	}
}