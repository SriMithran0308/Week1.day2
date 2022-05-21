package week1.day2;

public class Calculator
{
	public int add(int a, int b)
	{
		int sum=a+b;
		return sum;
	}
public double sub(double a,double b)
{
	double result=a-b;
	return result;
}
public double mul(double a,double b)
{
	double mul=a*b;
	return mul;
}

public int div(int a, int b)
{
	int div=a/b;
	return div;
}
	public static void main(String[] args) 
	{
		Calculator c=new Calculator();
	System.out.println(c.add(10,8));
	System.out.println(c.sub(10,7));
	System.out.println(c.mul(9, 9));
	System.out.println(c.div(81,9));
	}

}
