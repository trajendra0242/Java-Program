package day7;
class ArrayOdd {
	public static void main(String []args){
		int arr[]={10,31,59,22,33,45,44};
		int len=arr.length;
		for (int i=0;i<arr.length ;i++ )
		{
			if(arr[i]%2==0){
				System.out.println(arr[i]);
			}
		}

	}
	
	
}