package day7;
class DupliEArray {
	public static void main(String [] args){
	int a[]=new int[]{1,2,2,4,5,1,5};
	int len=a.length;
	for (int i=0;i<len;i++)
	{
		for (int j=i+1;j<len;j++)
		{
			if (a[i]==a[j])
			{
				System.out.println(a[j]);
			}
		}
	}

	}
}