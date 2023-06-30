package day6;
class SpyNoWR{
	public static void main(String[] args){
		//int no=132;
		for (int i=1;i<=100 ;i++ )
		{
			spyN(i);
		}
	}
	public static void spyN(int no){
		int sum=0;
		int pro=1;
		for (int i=no;i!=0 ;i/=10 )
		{
			
			int rem=i%10;
			sum+=rem;
			pro*=rem;
			
		}
		if(sum==pro){
			System.out.println(no);
		} 
	}
	
}