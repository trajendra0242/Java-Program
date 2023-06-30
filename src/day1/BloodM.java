package day1;
import java.util.Scanner;
class BloodM{
	public static void eligiblity(int a,int b){
		if (a>18)
		{
			if(b>55){
				System.out.println("Eligibale for blood donation.");
			}
			else{
				System.out.println("Not eligibale for blood donation because of weight");
			}

		}
		else{
			System.out.println("Not eligibale for blood donation because of age");
		}
		
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter the age");
			int age=sc.nextInt();
			System.out.println("Enter the weight");
			int weight=sc.nextInt();
			eligiblity(age,weight);
	
		}
}