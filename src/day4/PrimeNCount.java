package day4;

class PrimeNCount{
	public static void main(String []args) {
		int no=45433;
		extract(no);
	}
	public static void extract(int no){
		int prime1=0;
		for(int i=no;i!=0;i=i/10){
			int rem=i%10;
			int result=prime(rem);
			if(result==2){
				prime1++;
			}
		}
		System.out.println("Total Prime no = "+prime1);
	}
	public static int prime(int p){
		int count=0;
		for(int i=1;i<=p;i++){
			if(p%i==0){
				count++;
			}
			
		}
		return count;
	}
}