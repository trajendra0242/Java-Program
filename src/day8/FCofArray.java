package day8;
import java.util.HashSet;
class FCofArray {
	public static void main(String [] args){
		int arr[]={12,34,55,33,34,22,33,11,56};
		HashSet<Integer> sc=new HashSet<Integer>();
		for (int i=0;i<arr.length ;i++ )
		{
			sc.add(arr[i]);
		}
		for(int ar:sc){
			int count=0;
			for (int i=0;i<arr.length ;i++ )
			{
				if(ar==arr[i]){
					count++;
				}
			}
			System.out.println(ar+"="+count);
		}

	}
}