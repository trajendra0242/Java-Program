package day1;
import java.util.Scanner;
class EoMa{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter the person age: ");
			int age=sc.nextInt();
			if(age>=21){
				System.out.println("Person is eligible for Marriage.");
			}
			else{
				System.out.println("Not eligible for marriage.");
			}
		}
}