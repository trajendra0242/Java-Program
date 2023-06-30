package day11;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

class FileNotFE {
	public static void openFile(String path) throws FileNotFoundException {
		FileInputStream fis=new FileInputStream(path);
		System.out.println("File opend successfully");
	}
	public static void main(String []args ){
		String path="D:\\Demo.txt";
		
		try
		{
			openFile(path);
			System.out.println("try block ");
		}
		catch (FileNotFoundException f)
		{
			System.out.println("FNFE occerd");
		}
	}
}