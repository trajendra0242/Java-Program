package day4;

class ArmstrongNo{

	public static int pow(int rem,int count){
		int pro=1;
		for(int i=1;i<=count;i++){
			pro*=rem;
		}
		return pro;
	}

	public static void main(String [] args){
		int no=153;
		int count=0;

		int sum=0;
		for(int i=no;i!=0;i=i/10){
			int rem=i%10;
			count++;
		}
		for(int i=no;i!=0;i=i/10){
			int rem=i%10;
			sum+=pow(rem,count);
		}

		if(sum==no){
			System.out.println("Airmstrong no");
		}
		else{
			System.out.println("Not a airmstrong no");
		}
		
	}
	

}