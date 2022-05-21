package week1.day2;
public class MyCalculator
{

	public static void main(String[] args) 
	{
		Calc1 c1=new Calc1();
		System.out.println("Addition:\n" +c1.add(10, 15, 100));
		System.out.println("Sub of 2 numbers:\n" +c1.sub(278, 176));
		System.out.println("Multiplication of two numbers:\n" +c1.mul(1008, 76));
		System.out.println("Division of 2 numbers:\n" +c1.divide(25.6f,2));
	}

}
