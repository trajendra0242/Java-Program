package day2;
import java.util.Scanner;
class Factorial {
	public static void factorial(int n) {
		int fact=1;
		for(int i=1;i<=n;i++){
			fact*=i;
		}
		System.out.println("Factorial="fact);
	}
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no: ");
		int no=sc.nextInt();
		factorial(no);
	}
}