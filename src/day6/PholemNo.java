package day6;
class PholemNo {
	public static void main(String [] args){
		int no=3436;
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
		if (summ!=sume)
		{
			System.out.println("Phloem no");
		} else{
			System.out.println("Not Phloem no");
		}
	
	}
}