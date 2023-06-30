package day6;
class XylemNo {
	public static void main(String [] args){
		int no=3221;
		int summ=0;
		int sume=0;
		for(int i=no;i!=no;i/=10){
			if(i==no || i<10){
				sume+=i%10;
			}
			else{
				summ+=i%10;
			}
		}
		if (summ==sume)
		{
			System.out.println("Xylem no");
		} else{
			System.out.println("Not xylem no");
		}
	
	}
}