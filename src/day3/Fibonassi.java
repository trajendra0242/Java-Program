package day3;
import java.util.Scanner;
class Fibonassi{
	public static void fibo(int n){
		int a=0;
		int b=1;
		int c=a+b;
		for(int i=0;i<n;i++){
			//c=a+b;
			System.out.print(a+"\t");
			a=b;
			b=c;
			c=a+b;
		}
	}
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no: ");
		int no=sc.nextInt();
		System.out.println("*********Fibonassi Series*********");
		fibo(no);
	}
}