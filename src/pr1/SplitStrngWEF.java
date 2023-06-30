import java.util.*;
class SplitStrngWEF {
	public static void main(String []args) {
		int index=0;
		int c=0;
		ArrayList<String> words=new ArrayList();
		String str="Hello I am Rajendra";
		for (int i=0;i<str.length() ;i++ )
		{
			if (str.charAt(i)==' ')
			{
				words.add(str.substring(index,i));
				index=i+1;
			}
		}
		words.add(str.substring(index));
		for (String s: words ){
			System.out.println(s);
			c++;
		}
		System.out.println(c);
	}
}
