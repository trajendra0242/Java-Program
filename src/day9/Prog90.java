package day9;
class Prog90 {
	public static void main(String [] args){
		String str="ajk3#$fjfAA";
		int cschar=0;
		int cdigit=0;
		char ch[]=str.toCharArray();
		for (int i=0;i<ch.length ;i++ )
		{
			if (ch[i]>='0' && ch[i]<='9')
			{
				cdigit+=ch[i];
			}
			if (ch[i]>='a' && ch[i]<='a')
			{
				cschar+=ch[i];
			}
		}
	}
}