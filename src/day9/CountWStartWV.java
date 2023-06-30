package day9;
class CountWStartWV {

	public static void main(String []args){
		String str="Hello I am Rajendra";
		int count=0;
		for (String word:str.split(" ") )
		{
			
				char ch=word.charAt(0);
				if (ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				{
					count++;
				}
			
		}
		System.out.println(count);
		
	}
}
