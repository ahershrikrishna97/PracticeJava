package AbstarctClass;

public class AconcreteClass extends Abstract
{

	@Override
	public void test4() {
		// TODO Auto-generated method stub
		System.out.println("Test4 completed in concrete class");
	}

	public void test5()
	{
		System.out.println("test 5 executed ");
	}
	
	public static void main(String[] args) {
		
		AconcreteClass a=new AconcreteClass();
		a.test1();
		a.test2();
		a.test3();
		a.test4();
		a.test5();
	}
	
}
