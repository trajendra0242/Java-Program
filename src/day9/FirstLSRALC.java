package day9;
class FirstLSRALC {

	public static void main(String []args){
		String str="Hello I am Rajendra";
		String arr []=str.split(" ");


		for (int i=0;i<arr.length;i++)
		{
			String str1=arr[i];
			String rev="";
			for (int j=0;j<str1.length();j++)
			{	
				if (str1.charAt(j))
				{
					rev+=str1.toLowerCase();
				}
				else{
					rev+=str1.toUpperCase();
				} 
				//rev+=str1.charAt(j);
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
