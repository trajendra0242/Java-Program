package day3;
import java.util.Scanner;
class PrimeN {
	public static int prime(int n) {
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}

		}
		return count;
	}
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no: ");
		int no=sc.nextInt();
		System.out.println("*******Nth Prime No********");
		for(int i=1;i<=no;i++) {
			int res =prime(i);
			if (res==2)
			{	
				System.out.println(i);
			}


		}
		
	}
}