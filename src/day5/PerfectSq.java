package day5;
import java.util.Scanner;
class PerfectSq {
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no: ");
		int no=sc.nextInt();
		if(perfectS(no)){
			System.out.println("Perfect Squre");
		} else{
			System.out.println("Not a perfect squre.");	
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