class ReverseWords {
	public static void main(String []args) {
		String str="Hello I am Rajendra";
		String []arr=str.split(" ");
		for (int i=arr.length-1;i>=0;i-- )
		{
			System.out.println(arr[i]);
		}

	}
}