package day7;
class SeurchEArray {
	public static void main(String []args){
		int arr[]={10,31,59,22,33,45,44};
		int key=100;
		int len=arr.length;
		boolean flag=false;
		for (int i=0;i<arr.length ;i++ )
		{
			if (arr[i]==key)
			{
				flag=true;
				break;
			}	
		}
		if (flag)
		{
				System.out.println("The element is presnent..!!");
		}else {
				System.out.println("The element is not present");
		}
	}
}