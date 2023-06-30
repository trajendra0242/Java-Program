package day1;
//import java.util.Scanner;

class Greter_foure{
	public static int greater(int a,int b,int c,int d){
		int res=(a>b?(a>c?a:c):(b>c?b:c))>d?(a>b?(a>c?a:c):(b>c?b:c)):d;
		return res;
	}
	public static void main(String [] args){
		int no1=40;
		int no2=100;
		int no3=700;
		int no4=300;
		greater(no1,no2,no3,no4);
		
		System.out.println(greater(no1,no2,no3,no4));
		}
	
}