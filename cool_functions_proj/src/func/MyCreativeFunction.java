package func;

public class MyCreativeFunction implements DoubleFunctionOfTwoInts 
{
	@Override
	public double fOfXY(int x, int y) 
	{
		return (x * y) + (x * x) - (y * y);
	}

	@Override
	public String getName() 
	{
		return "My Creative Function";
	}
}
