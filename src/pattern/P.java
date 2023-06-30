package pattern;
class P {
/*	public static void main(String []args){
		int n=10;
		for (int i=1;i<=n ;i++ )
		{
			
			if (i<=n/2)
			{
				for (int j=1;j<=i ;j++ )
				{
					System.out.print("* ");			
				}
			}
			
			for (int j=n/2+1;j<=i ;j++ )
			{
				System.out.print("* ");			
			}
			if (i>=n/2)
			{
				for (int k=n-i;k>=1 ;k-- )
				{
					System.out.print("  ");
				}
				for (int j=n/2+1;j<=i ;j++ )
				{
					System.out.print("* ");			
				}
				
			}
			
			
			System.out.println();
		}
	} 
	*/
	public static void main(String []args){
		int n=10;
		for (int i=1;i<=n/2 ;i++ )
		{
			
			for (int k=1;k<=i ;k++ )
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i=1;i<=n/2 ;i++ )
		{
			
			for (int k=1;k<=i ;k++ )
			{
				System.out.print("* ");
			}
			for (int j=1;j<=n/2-i ;j++ )
			{
				System.out.print("  ");
			}
			for (int k=1;k<=i ;k++ )
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
	}
}

/*

*
* *
* * *
* * * *
*       *
* *     * *
* * *   * * *
* * * * * * * *

*/