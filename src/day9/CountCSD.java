package day9;
class CountCSD
{
	public static void main(String []args){
		String str="hello world!@#";
		int vcount=0;
		int ccount=0;
		int spcount=0;
		int sccount=0;
		for (int i=0;i<str.length() ;i++ )
		{
			char ch=str.charAt(i);
			if (ch>='a' && ch<='z')
			{
				if (ch=='a'||ch=='e'||ch=='o'||ch=='u'||ch=='i')
				{
					vcount++;
				} else {
					ccount++;
				}
			} else{
				if (ch==' ')
				{
					spcount++;
				} else{
					sccount++;
				}
			}
		}
		System.out.println("Vowel="+vcount);
		System.out.println("Consonant"+ccount);
		System.out.println("spaces"+spcount);
		System.out.println("special char"+sccount);
	}
}