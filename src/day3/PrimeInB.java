package day3;
import java.util.Scanner;
class PrimeInB {
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
		System.out.println("Enter two no no1 and no2: ");
		int no1=sc.nextInt();
		int no2=sc.nextInt();
		System.out.println("Prime no in between "+no1+" and "+no2);
		for(int i=no1;i<=no2;i++) {
			int res =prime(i);
			if (res==2)
			{	
				System.out.println(i);
			}


		}
		
	}
}