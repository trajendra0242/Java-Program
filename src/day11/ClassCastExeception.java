package day11;
class ClassCastExeception {
	public static void main(String []args){
		
	}
}

class B extends ClassCastExeception
{
	int s=10;
	ClassCastExeception ce=new B();
}