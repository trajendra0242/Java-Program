package day8;
class BubbleS {
	public static void main(String []args){
		int arr[]={12,22,11,1,44,13};
		for (int i=0;i<arr.length ;i++ )
		{
			for (int j=0;j<arr.length-1 ;j++ )
			{
				if (arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("**********Sorted array*******");
		for (int i=0;i<arr.length ;i++ )
		{
			System.out.print(arr[i]+" ");
		}
	}
}