package day7;
import java.util.Scanner;
class FlargesUM {
	public static void largest(int a,int b,int c){
		int res=(a>b?a:b)>c?(a>b?a:b):c;
		System.out.println("Largest= "+res);
	}
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the three no: ");
		int a=sc.nextInt();		
		int b=sc.nextInt();
		int c=sc.nextInt();
		largest(a,b,c);
	}
}