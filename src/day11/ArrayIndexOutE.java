package day11;
class ArrayIndexOutE
{
	public static void main(String []args){
		int arr[]={1,2,3};
		try
		{
			arr[4]=4;
		}
		catch (Exception e)
		{
			System.out.println("ArrayIndexOutBouns excepiton is handled.");
		}
		
	}
	
}