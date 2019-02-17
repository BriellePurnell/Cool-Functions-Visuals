package func;

public class Complex 
{
	private double real;
	private double imaginary;

	// Constructs an instance, given its real and imaginary components.
	public Complex(double real, double imaginary) 
	{
		this.real = real;
		this.imaginary = imaginary;
	}

	// Constructs an instance that duplicates source.
	public Complex(Complex source) 
	{
		this.real = source.real;
		this.imaginary = source.imaginary;
	}

	// Getter method.
	public double getReal() 
	{
		return real;
	}

	// Getter method.
	public double getImaginary() 
	{
		return imaginary;
	}

	//
	// Constructs and returns a new instance of Complex that represents the sum of
	// its inputs,
	// according to the following formula:
	//
	// (a+bi) plus (c+di) = (a+c) + (b+d)i
	//
	public static Complex add(Complex c1, Complex c2) 
	{
		double r = c1.real + c2.real;
		double i = c1.imaginary + c2.imaginary;
		return new Complex(r, i);
	}

	//
	// Constructs and returns a new instance of Complex that represents the product
	// of its inputs,
	// according to the following formula:
	//
	// (a+bi) times (c+di) = a*c + a*di + bi*c + bi*di = ac + (ad+bc)i + bd*ii
	// Since ii is -1 by definition, the last term is -bd ==> the result is ac-bd +
	// (ad+bc)i
	//
	public static Complex multiply(Complex c1, Complex c2) 
	{
		double r1 = c1.real;
		double r2 = c2.real;
		double i1 = c1.imaginary;
		double i2 = c2.imaginary;
		return new Complex(r1 * r2 - i1 * i2, r1 * i2 + r2 * i1);
	}

	//
	// The "norm" of complex number a+bi is the square root of (a^2 + b^2).
	//
	public double norm() 
	{
		return Math.hypot(real, imaginary);
	}
}
