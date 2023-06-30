package day5;
class NeonNWR{
	public static void main(String [] args){
		int no1=1;
		int no2=100;
		
		System.out.println("*******Neon No*******");
		for (int j=no1;j<=no2 ;j++ )
		{
			int sum=0;
			int res=squre(j);
			for(int i=res;i!=0;i=i/10){
				int rem=i%10;
				sum+=rem;
			}

			if(sum==j){
				System.out.println(j);
			} 
		}
	}
	public static int squre(int n){
		return n*n;
	}
}