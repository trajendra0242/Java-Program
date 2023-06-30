package day5;
class NeonN{
	public static void main(String [] args){
		int no=9;
		int sum=0;
		int res=squre(no);
		for(int i=res;i!=0;i=i/10){
			int rem=i%10;
			sum+=rem;
		}
		if(sum==no){
			System.out.println("Neon no");
		} else{
			System.out.println("Not n");
		}

	}
	public static int squre(int n){
		return n*n;
	}
}