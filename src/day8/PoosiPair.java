package day8;
class PoosiPair {
	public static void main(String []args){
		int arr[]={1,2,4,3,5};
		int key=4;
		for (int i=0;i<arr.length ;i++ )
		{
			for (int j=0;j<arr.length ;j++ )
			{
				if (((arr[i]+arr[j])==key)&& arr[i]!=arr[j])
				{
					System.out.println(arr[i]+","+arr[j]);
				}
			}
		}
	}
}