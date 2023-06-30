package day1;
import java.util.Scanner;
class EfBl{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter the person age: ");
			int age=sc.nextInt();
			if(age>=18 && age <=55){
				System.out.println("Person is eligible for blood donation.");
			}
			else{
				System.out.println("Person is not eligible for blood donation.");
			}
		}
}