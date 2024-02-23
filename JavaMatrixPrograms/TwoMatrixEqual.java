// Check Two Matrix Are Equal?
class TwoMatrixEqual{
	public static void main(String[] args){
		int[][] matrix1 = {{12,45,36},
							{12,54,36},
								{23,67,32}};
		int[][] matrix2 = {{12,45,36},
							{12,54,36},
								{23,67,32}};
		int flag=1;
		if(matrix1.length==matrix2.length){
			for(int i=0;i<3;i++)
				for(int j=0;j<3;j++)
					if(matrix1[i][j]!=matrix2[i][j])
						flag=0;
		}else{
			System.out.print("Matrix Are In Different Dimension");
			System.exit(0);
		}
		if(flag==1)
			System.out.print("Matrix Are Equal");
		else
			System.out.print("Matrix Are Different");
	}
}