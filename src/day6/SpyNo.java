package day6;
class SpyNo{
	public static void main(String[] args){
		int no=132;
		int sum=0;
		int pro=1;
		for (int i=no;i!=0 ;i/=10 )
		{
			
			int rem=i%10;
			sum+=rem;
			pro*=rem;
			
		}
		if(sum==pro){
			System.out.println("Spy no");
		} else{
			System.out.println("Not spy no");
		}
	}
	
}