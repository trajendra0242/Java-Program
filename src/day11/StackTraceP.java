package day11;

class SalaryException extends RuntimeException
{
	@Override
		public String getMessage(){
			return "Salary cannot be negative";
		}

}
class StackTraceP {
	static void m1(){
		m2();
	}
	static void m2(){
		throw new SalaryException();
	}
	public static void main(String []args){
		System.out.println("Main start");
		try
		{
			m1();

		}
		catch (SalaryException e)
		{
			e.printStackTrace();
		}
		System.out.println("main end");
	}
}
