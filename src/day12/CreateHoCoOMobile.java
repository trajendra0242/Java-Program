package day12;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
import java.util.TreeSet;

class Mobile implements Comparable {
	String brand;
	int price;
	Mobile(String brand,int price){
		this.brand=brand;
		this.price=price;
	}

	@Override
	public String toString(){
		return "Brand "+this.brand+" "+"Price "+this.price;
	}

	@Override
	public boolean equals(Object o){
		
		Mobile temp=(Mobile)o;
		if (this.brand==temp.brand && this.price==temp.price)
		{
			return true;
		}
		return false;
	}

	@Override
	public int hashCode(){
		return brand.hashCode()+((Integer)price).hashCode();
	}

	public int compareTo(Object o) {
		
		Mobile temp = (Mobile) o ;
		if (this.price > temp.price )
		{
			return 1 ;
		}
		if (this.price < temp.price)
		{
			return -1 ;
		}
		return 0 ;
	}

/*	Collections.sort(a1);
	for (Object o:a1 )
	{
		System.out.println(o);
	}
*/
	
}

class CreateHoCoOMobile {
	public static void main(String []args) {
		//ArrayList a1=new ArrayList();
		TreeSet a1=new TreeSet();
		a1.add(new Mobile("Samsung s32",100000));
		a1.add(new Mobile("Apple iphone s3",200000));
		a1.add(new Mobile("Vivo v2022",30000));
		a1.add(new Mobile("Sony s2",40000));
		a1.add(new Mobile("Sony s2",40000));

		System.out.println("===================");
		
		Iterator i=a1.iterator();
		while (i.hasNext())
		{
			System.out.println(i.next()+" ");
		}

	/*	for (Object o:a1 )
		{
			System.out.println(o);
		}
		
		System.out.println("===================");
		for (int i=0;i<a1.size() ;i++ )
		{
			System.out.println(a1.get(i));
		}
		
		System.out.println("===================");
		Iterator i=a1.iterator();
		while (i.hasNext())
		{
			System.out.println(i.next());
		}

		*/



	}
}