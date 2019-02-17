package func;

public class ComplexNormFunction implements DoubleFunctionOfTwoInts 
{
	@Override
	public double fOfXY(int x, int y) 
	{
		Complex newCompNum = new Complex(x, y);
		return newCompNum.norm();
	}

	@Override
	public String getName() 
	{
		return "Complex Norm Function";
	}

}
