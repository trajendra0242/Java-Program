package day1;
import java.util.Scanner;
class CarPrise
{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter car price");
		int price=sc.nextInt();
		if(price<=500000){
			double res=(10*price)/100;
			System.out.println("You have to pay 10% = "+res);
		}
		else if(price>500000 && price<=1000000){
			double res=(5*price)/100;
			System.out.println("You have to pay 5% = "+res);
		}
		else {
			double res=(20*price)/100;
			System.out.println("You have to pay 20% = "+res);
		}
		System.out.println("Price= "+(price+res));

	}
}