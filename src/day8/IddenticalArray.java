package day8;
class IddenticalArray {
	public static void main(String []args){
		int arr[]={10,20,30};
		int arr1[]={110,20,30};
		int len1=arr.length;
		int len2=arr.length;
		boolean flag=false;
		if(len1==len2){
			for (int i=0;i<arr.length ;i++ )
			{
				if(arr[i]==arr1[i]){
					flag=true;
				}
				else {
					flag = false ;
					break ;
				}
			}
			if (flag)
			{
				System.out.println("identical") ;
			}
			else {
				System.out.println("not identical") ;
			}
			
		} else{
			System.out.println("Not Identical");
		}
	}
}