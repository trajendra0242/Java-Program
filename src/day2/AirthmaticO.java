package day2;
import java.util.Scanner;
class AirthmaticO {
	public static int add(int a,int b) {
		return a+b;
	}
	public static int sub(int a,int b) {
		return a-b;
	}
	public static int mul(int a,int b) {
		return a*b;
	}
	public static int div(int a,int b) {
		return a/b;
	}
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two no: ");
		int no1=sc.nextInt();
		int no2=sc.nextInt();
		System.out.println("Addition="+add(no1,no2));
		System.out.println("Subtraction="+sub(no1,no2));
		System.out.println("Multiplication="+mul(no1,no2));
		System.out.println("Division="+div(no1,no2));
	}
}