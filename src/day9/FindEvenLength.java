package day9;
class FindEvenLength {

	public static void main(String []args){
		String str="Hello I am Rajendra";
		
		for (String word:str.split(" ") )
		{
			if (word.length()%2==0)
			{
				System.out.println(word);
			}
		}
	}
}
