package day7;
import java.util.Scanner;

class FSLArray {
	public static void main(String []args){
	int arr[]={6,8,2,4,3,1,5,7};
	int n=arr.length;
	int min=arr[0];
	int smin=arr[0];
	int temp;
	for (int i=0;i<n ;i++ )
	{		
		for (int j=i+1;j<n ;j++ )
		{
			if (arr[i]>arr[j])
			{
			    temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		
	}
	
	System.out.println(min);
	System.out.println(arr[1]);

	}
}


/*
class FSLArray
{

public static void main(String args[]) {
	int a[]={1,2,3};
	int n=a.length;
	int min = a[0];
	int sm = a[0];
	for (int i = 0; i < n; i++) {
		if (a[i] < min) {
	
			min = a[i];
		}
	}
	System.out.println(min);
	for (int i = 0; i < n; i++) {
		if (a[i] != min && a[i] < sm) {
			sm = a[i];
		}
	}
	System.out.println("Second smallest element is " + sm);
	}
}

*/