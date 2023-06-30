package day6;
class SunnyNo {
	public static void main(String []args){
		int no=15;
		int no1=no+1;
		if(psqure(no1)){
			System.out.println("Sunny No");
		} else{
			System.out.println("Not a sunny no");
		}
	}
	public static boolean psqure(int n){
		boolean flag=true;
		for (int i=1;i<=n ;i++ )
		{
			if (i*i==n)
			{
				return flag;	
			} 
		}
		return flag=false;

	}
}