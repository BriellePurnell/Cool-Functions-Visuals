package func;

public class ComplexSquaredNormFunction implements DoubleFunctionOfTwoInts 
{
	@Override
	// Constructs an instance, given its real and imaginary components.
	public double fOfXY(int x, int y) 
	{
		Complex newCompNum = new Complex(x, y);
		Complex squared = Complex.multiply(newCompNum, newCompNum);
		return squared.norm();
	}

	@Override
	public String getName() 
	{
		return "Complex Squared Norm Function";
	}
}
