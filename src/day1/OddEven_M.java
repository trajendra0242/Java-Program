package day1;
import java.util.Scanner;
class OddEven_M{
	public static void oddeven(int no){
		if(no%2!=0){
				System.out.println("Odd");
			}
			else{
				System.out.println("Even");
			}
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter the no: ");
			int no=sc.nextInt();
			oddeven(no);
	}
}