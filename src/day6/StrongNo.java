package day6;
class StrongNo {
	public static void main(String [] args){

		for (int i=1;i<=10000 ;i++ )
		{
			last(i);
		}
	}	
	public static void last(int a){
		int sum=0;
		for (int i=a;i!=0 ;i=i/10 )
		{
			int rem=i%10;
			sum+=facto(rem);
		}
		if (sum==a)
		{
			System.out.println(a);
		}
	}
	public static int facto(int n){
		int fact=1;
		for (int i=1;i<=n ;i++ )
		{
			fact=fact*i;
		}
		return fact;
	}
}