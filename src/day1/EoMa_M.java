package day1;
import java.util.Scanner;
class EoMa_M{
	public static void marriageC(int age){
		if(age>=21){
				System.out.println("Person is eligible for Marriage.");
			}
			else{
				System.out.println("Person is not eligible for marriage.");
			}
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter the person age: ");
			int age=sc.nextInt();
			marriageC(age);
		}
}