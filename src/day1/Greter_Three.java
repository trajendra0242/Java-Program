package day1;
//import java.util.Scanner;

class Greter_Three{
	public static int greater(int a,int b,int c){
		int res=a>b?(a>c?a:c):(b>c?b:c);
		return res;
	}
	public static void main(String [] args){
		int no1=40;
		int no2=100;
		int no3=30;
		greater(no1,no2,no3);
		
		System.out.println(greater(no1,no2,no3));
		}
	
}