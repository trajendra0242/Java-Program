package day9;
class ReverseWordString
{
	public static void main(String []args){
		String str="Hello I am Rajendra";
		String arr []=str.split(" ");


		for (int i=0;i<arr.length;i++)
		{
			String str1=arr[i];
			String rev="";
			for (int j=str1.length()-1;j>=0 ;j-- )
			{
				rev+=str1.charAt(j);
			}
			arr[i]=rev;
			//System.out.println(rev);
		}
		for (String el:arr )
		{
			System.out.print(el+" ");
		}
		
	}
	

}