package day1;
import java.util.Scanner;
class SringMsg_16 {
	public static void method(int i){
		if(i%3==0 && i%5==0){
				System.out.println("HIBYE");
			}
			else if(i%3==0){
				System.out.println("HI");
			}
			else if(i%5==0){
				System.out.println("BYE");
			}
			else{
				System.out.println(i);
			}
	}
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no: ");
		int no=sc.nextInt();
	
		for (int i=1;i<=no;i++)
		{
			method(i);			
		}
	}
}