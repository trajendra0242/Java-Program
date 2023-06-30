package day8;
class ElemSepOddEven {
	public static void main(String []args){
	int arr[]={9,2,1,8,6};
		for (int i=0;i<arr.length ;i++ )
		{
			for (int j=0;j<arr.length-1 ;j++ )
			{
				if (arr[j]%2==0)
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		// System.out.println("**********Sorted array*******");
		for (int i=0;i<arr.length ;i++ )
		{
			System.out.print(arr[i]+" ");
		}
}}