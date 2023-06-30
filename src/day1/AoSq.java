package day1;
import java.util.Scanner;
class AoSq{
	public static int area(int a){
		int res=a*a;
		return res;
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter the size of squre: ");
			int size=sc.nextInt();
			int res=area(size);
			System.out.println("Area of squre is= "+res);
	
		}
}