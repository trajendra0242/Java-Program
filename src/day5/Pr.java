package day5;
class Pr{
	public static void ps(int n){
		int sum=0;
		for (int i=1;i<n ;i++ )
		{
			if(n%i==0){
				System.out.println(i);
				sum+=i;
			}
		}
		if (sum==n)
		{
			System.out.println(n);
		}
		
		
	}
	public static void main(String []args){
		for (int i=1;i<=100 ;i++ )
		{
			ps(i);
		}

	}
}