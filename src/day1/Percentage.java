package day1;
import java.util.Scanner;
class Percentage
{
	public static void percen(double math,double english,double cs,double programming,double total){
		double res=(math+english+cs+programming)*100/400;
		System.out.println("Total marks percentage is="+res);
	}
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the following subject marks: \n 1.Maths \n 2.English \n 3.CS \n 4.Programming");
		double m=sc.nextDouble();
		double e=sc.nextDouble();
		double c=sc.nextDouble();
		double p=sc.nextDouble();
		double t=m+e+c+p;
		percen(m,e,c,p,t);

	}
} 