class CountFreA{
	public static void main(String [] args){
		int [] arr={5,8,9,9,8,8};
		int size=arr.length;
		countF(arr,size);
	}
	public static void countF(int [] arr,int size){
		for (int i=0;i<size ;i++ )
		{
			int flag=0;
			int count=0;
			for (int j=i+1;j<size ;j++ )
			{
				if (arr[i]==arr[j])
				{
					flag=1;
					break;
				}
			}
			if(flag==1)
				continue;
			for (int j=0;j<=i ;j++ )
			{
				if (arr[i]==arr[j])
				{
					count++;

				}
			}
			System.out.println(arr[i]+": "+count);
		}
	}
}