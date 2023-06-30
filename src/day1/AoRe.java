package day1;
import java.util.Scanner;
class AoRe{
	public static void area(int a,int b){
		int res=a*b;
		System.out.println(res);
	}
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length & breath.");
		int len=sc.nextInt();
		int breath=sc.nextInt();
		area(len,breath);
	}
}