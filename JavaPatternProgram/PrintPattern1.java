//Print This Pattern
/*
1   2   3   4   5   6   7   8   9   10
36  37  38  39  40  41  42  43  44  11
35  64  65  66  67  68  69  70  45  12
34  63  84  85  86  87  88  71  46  13
33  62  83  96  97  98  89  72  47  14
32  61  82  95  100 99  90  73  48  15
31  60  81  94  93  92  91  74  49  16
30  59  80  79  78  77  76  75  50  17
29  58  57  56  55  54  53  52  51  18
28  27  26  25  24  23  22  21  20  19
*/
class PrintPattern1{
	public static void main(String[] args){
		int a[][]=new int[10][10];
		int i,j,low=0,top=9,n=1;
		for(i=0;i<5;i++,low++,top--)
		{
			for(j=low;j<=top;j++,n++)
				a[i][j]=n;
			for(j=low+1;j<=top;j++,n++)
				a[j][top]=n;
			for(j=top-1;j>=low;j--,n++)
				a[top][j]=n;
			for(j=top-1;j>low;j--,n++)
				a[j][low]=n;
		}
		for(i=0;i<10;i++){
			for(j=0;j<10;j++){
				System.out.printf("%3d",a[i][j]);
			}
			System.out.println();
		}
	}
}