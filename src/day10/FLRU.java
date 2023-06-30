package day10;
class FLRU {
	public static void main(String []args){
		String str="Hello I am Rjendra";
		System.out.print((str.charAt(0)+"").toLowerCase());
		for (int i=1;i<str.length() ;i++ )
		{
			if (str.charAt(i-1)==' ')
			{
				System.out.print((str.charAt(i)+"").toLowerCase());
			} else{
				System.out.print((str.charAt(i)+"").toUpperCase());
			}
		}
		
	}
}