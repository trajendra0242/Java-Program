package day3;
import java.util.Scanner;
class Palindrome {
	public static int rev(int n){
		int reverse=0;
		for(int i=n;i!=0;i=i/10){
			int rem=i%10;
			reverse=reverse*10+rem;
		}
		return reverse;
	}
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Ente the no: ");
		int no=sc.nextInt();
		int result=rev(no);
		if (result==no)
		{
			System.out.println("Palindrome no..");
		}
		else{
		System.out.println("Not a palindrome no..");
		}
		
	}
}