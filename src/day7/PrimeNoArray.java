package day7;
class PrimeNoArray {
	public static void main(String []args){
		int arr[]={10,31,59,22,33,45,44};
		int len=arr.length;
		for (int i=0;i<arr.length ;i++ )
		{
			int count=0;
			for (int j=1;j<=arr[i] ;j++ )
			{
				if (arr[i]%j==0)
				{
					count++;
				}
			}
			if (count==2)
			{
				System.out.println(arr[i]);
			}
		}

	}
}