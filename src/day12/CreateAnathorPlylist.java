package day12;
import java.util.ArrayList;
class CreateAnathorPlylist {
	public static void main(String []args){
		ArrayList <String> pl=new ArrayList<>();
		pl.add("Song1");
		//pl.add("Song2");
		//pl.add("Song3");
		//pl.add("Song4");
		ArrayList<String> pl2=new ArrayList<>();
		pl2.add("Song1");
		pl2.add("Song2");
		
		pl2.retainAll(pl);
		for (Object s:pl2 )
		{
			System.out.println(s);
		}
	}
}