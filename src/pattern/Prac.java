//package pattern;
import java.util.Scanner;
class Prac {
	public static void main(String []args){
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array Size! ");
		int s=sc.nextInt();
		int arr[]=new int[s];
		System.out.println("Enter array element! ");
		for (int i=0;i<s ;i++ )
		{
			arr[i]=sc.nextInt();
		}

		for (int i=0;i<arr.length ;i++ )
		{
			
			sum+=res(arr[i]);
		}
		System.out.println(sum);
		

	}
	public static int res(int res){
		int pow=0;
		int base=0;
		int mul=1;
		for (int i=res;i!=0 ;i=i/10 )
		{
			if (i==res)
			{
				 pow=i%10;

			}
			if (i<10)
			{
				 base=i%10;
			}
		}
		for (int j=1;j<=pow ;j++ )
		{
			mul*=base;
		}
		return mul;
	}
}
/*
Enter array Size!
2
Enter array element!
30
52
26
*/