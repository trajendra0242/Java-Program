package day11;

class SalaryException extends RuntimeException
{
	@Override
		public String getMessage(){
			return "Salary cannot be negative";
		}

}
class Employee
{
	String name;
	double salary;

	Employee(String name,double salary){
		this.name=name;
		if (salary>0)
		{
			this.salary=salary;
		} else{
			throw new SalaryException();
		}
	}

}

class Prog99
{
	public static void main(String []args){
		try
		{
			Employee e1=new Employee("Tinku",100000);
			System.out.println("e1 created");
			Employee e2=new Employee("Tinku",-11222);
			System.out.println("e2 created");

		}
		catch (SalaryException e)
		{
			System.out.println(e.getMessage());
		}
	}
}



