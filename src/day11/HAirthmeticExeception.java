package day11;
class HAirthmeticExeception {
	public static void main(String []args){
		int a=1;
		int b=0;
		try
		{
			int res=a/b;
			System.out.println(res);
		}
		catch (Exception e)
		{
			System.out.println("Handling Airthmetic Exception ");
		}
			
		
	}
}