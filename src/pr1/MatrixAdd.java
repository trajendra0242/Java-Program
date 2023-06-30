class MatrixAdd {
	public static void main(String []args) {
		int arr1[][]={{1,2,3},{1,2,3}};
		int arr2[][]={{1,2,3},{1,2,3}};
		int row=2;
		int col=3;
		int sum[][]=new int[row][col];
		for (int i=0;i<arr1.length ;i++ )
		{
			for (int j=0;j<arr2.length ;j++ )
			{
				sum[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
		for (int i=0;i<arr1.length ;i++ )
		{
			for (int j=0;j<arr2.length ;j++ )
			{
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}
	}
}