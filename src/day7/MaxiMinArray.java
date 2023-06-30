package day7;
class MaxiMinArray {
	public static void main(String [] args){
		int a[]={41,24,13,74,55,50};
		int len=a.length;
		int min=a[0];
		int max=a[0];
		for (int i=0;i<len ;i++ )
		{
			//int j=i+i;
			if (a[i]<=min)
			{
				min=a[i];
			}
			if (a[i]>min)
			{
				max=a[i];
			}
			
		}
		System.out.println("Minimum= "+min);
		System.out.println("Maximum= "+max);
	}
}
