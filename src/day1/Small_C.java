package day1;
//import java.util.Scanner;

class Small_C{
	public static int greater(int a,int b){
		int res=a>b?a:b;
		return res;
	}
	public static void main(String [] args){
		int no1=40;
		int no2=20;
		greater(no1,no2);
		
		System.out.println(greater(no1,no2));
		}
	
}