package day3;
import java.util.Scanner;
class DigitalProductEvenno{
	public static void digitalSum(int no){
		int pro=1;
		for(int i=no;i>=1;i=i/10){
			int rem=i%10;
			if(rem%2==0){
				pro*=rem;
			}

		}
		System.out.println("Digital product of even no="+pro);
	}
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no");
		int no=sc.nextInt();
		//int no=123;
		digitalSum(no);
	}
}