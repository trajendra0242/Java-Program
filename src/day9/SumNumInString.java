package day9;
class SumNumInString {
	public static void main(String [] args){
		String str="Fs8g6hu";
		char []ch=str.toCharArray();
		int sum=0;
		for (int i=0;i<ch.length ;i++ )
		{
			if (ch[i]>='0' && ch[i]<='9')
			{
				sum+=ch[i]-'0';
			}
		}
		System.out.println(sum);
	}
}