package day11;
class StringIndexBoundE {
	public static void main(String []args) {
		String s="Hello";
		
		try
		{
			System.out.println(s.substring(6));
		}
		catch (Exception e)
		{
			System.out.println("SIOBE handled.");
		}
	}
}