package day5;
import java.util.Scanner;
class PerfectSqWR {
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range of no ");
		int no1=sc.nextInt();
		int no2=sc.nextInt();
		System.out.println("******Perfect Squres No******");
		for (int i=no1;i<=no2 ;i++ )
		{
			if(perfectS(i)){
				System.out.println(i);
			} 
		}
	}
	public static boolean perfectS(int no){
				for( int i=1;i<=no;i++){
					if(i*i==no){
						return true;
					}
				}	
		return false;
	}
}