package day2;
import java.util.Scanner;
class DigitalSumEvenno{
	public static void digitalSum(int no){
		int sum=0;
		for(int i=no;i>=1;i=i/10){
			int rem=i%10;
			if(rem%2==0){
				sum+=rem;
			}

		}
		System.out.println("Digital sum of even no="+sum);
	}
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no");
		int no=sc.nextInt();
		//int no=123;
		digitalSum(no);
	}
}