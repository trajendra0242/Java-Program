package day7;
import java.util.Scanner;
class AreaSC {
	public static void area(int a,String name){
		if(name.equals("squre")){
			System.out.println("Area of Squre= "+a*a);
		}
		if(name.equals("circle")){
			System.out.println("Area of Circle= "+(3.14*a*a));
		}
		else{
			System.out.println("Invalid String..!!");
		}
	}
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		String name=sc.next();
		area(a,name);
	}
}