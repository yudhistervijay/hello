
public class Calculator {
	private double x;
	private double y;
	private double sum;
	private double diff;
	private double product;
	private double quotient;
	private double remainder;
	public void setValues(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	public void getsum()
	{
		sum=x+y;
		System.out.println("sum of two num :"+sum);
	}
	public void getdiffrence()
	{
		diff=x-y;
		System.out.println("difference of two num :"+diff);
	}
	public void getproduct()
	{
		product=x*y;
		System.out.println("product of two num :"+product);
	}
	public void getquotient()
	{
		quotient=x/y;
		System.out.println("division of two num :"+quotient);
	}
	public void getremainder()
	{
		remainder=x%y;
		System.out.println("remainder of two num :"+remainder);
	}

}
