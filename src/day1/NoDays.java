package day1;
import java.util.Scanner;
class NoDays{
		public static void main(String args[]){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the month no: ");
			int ch=sc.nextInt();
			switch (ch)
			{
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
				{
				System.out.println("31");
				}
			break;			
			case 4:
			case 6:
			case 9:
			case 11:
				{
				System.out.println("30");
				}	
			break;
			case 2:{
				System.out.println("28 or 29");
			}
			break;
			default:{
			System.out.println("Invalid month choise");
		}
			}
		}
}