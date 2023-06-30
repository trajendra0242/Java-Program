package day1;

import java.util.Scanner;
class AreaSp
{
	public static void area(int r){
		double res=4*3.14*r*r;
		System.out.println("Area of Speare:-"+res);
	}
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius of speare: ");
		int radius=sc.nextInt();
		area(radius);
	}
}