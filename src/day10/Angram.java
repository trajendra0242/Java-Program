package day10;
import java.util.*;
class Angram {
	public static void main(String [] args){
		String str1="Race";
		String str2="Care";

		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		if (str1.length()==str2.length())
		{
			char []ch1=str1.toCharArray();
			char []ch2=str2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			boolean res=Arrays.equals(ch1,ch2);
			if (res)	
			{
				System.out.println("Angram");
			} else{
				System.out.println("Not Angram");
			} 
		} else {
			System.out.println("Not angram");
		}
	}
}