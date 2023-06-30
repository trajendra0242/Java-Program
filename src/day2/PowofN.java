package day2;
import java.util.Scanner;
class PowofN {
	public static int powofn(int p,int n) {
		int res=1;
		for(int i=1;i<=n;i++){
			res*=p;
		}
		return res;
	}
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of base p:");
		int p=sc.nextInt();
		System.out.println("Enter the value of exponant n:");
		int n=sc.nextInt();
		System.out.println("Res="+powofn(p,n));
		
	}
}