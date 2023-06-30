package day11;
class NullPointerE {
	public static void main(String []args){
		String s=null;
		try
		{
			s.toUpperCase();
		}
		catch (Exception e)
		{
			System.out.println("Handled NullPointerExeception");
		}
		
		
	}
	
}