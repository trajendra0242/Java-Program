package day1;
import java.util.Scanner;
class AoCir{
	public static double area(int a){
		double res=3.14*a*a;
		return res;
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter the radius of Circle: ");
			int radius=sc.nextInt();
			double res=area(radius);
			System.out.println("Area of circle is= "+res);
	
		}
}