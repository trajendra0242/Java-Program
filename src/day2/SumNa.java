package day2;
import java.util.Scanner;
class SumNa {
	public static void sumna(int n) {
		int sum=0;
		for(int i=1;i<=n;i++){
			sum+=i;
		}
		System.out.println("Sum of "+n+" is ="+sum);
	}
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no: ");
		int no=sc.nextInt();
		sumna(no);
	}
}