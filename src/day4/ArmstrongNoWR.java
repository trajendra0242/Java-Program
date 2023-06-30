package day4;
import java.util.Scanner;
class ArmstrongNoWR{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range 1 to n: ");
		int no=sc.nextInt();
		for(int i=1;i<=no;i++){
			armstrongno(i);
			
		}
	}
	public static void armstrongno(int no){
		int count=0;
		int no1=no;

		int sum=0;
		for(int i=no;i!=0;i=i/10){
			int rem=i%10;
			count++;
		}
		for(int i=no;i!=0;i=i/10){
			int rem=i%10;
			sum+=pow(rem,count);
		}
		if(sum==no1){
			System.out.println(sum);
		}

	}
	public static int pow(int rem,int count){
		int pro=1;
		for(int i=1;i<=count;i++){
			pro*=rem;
		}
		return pro;
	}
}
