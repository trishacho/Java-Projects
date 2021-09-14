public class ComplexArr implements Comparable <ComplexArr>
{
	private double real; // real part
	private double imag; //imaginary part
	private double r;
	private double theta;
	public ComplexArr()
	{
		real = imag = r = theta = 0.0;
	}
	public ComplexArr(double real, double imag)
	{
		this.real = real;
		this.imag = imag;
		polarize();
	}
	public double getReal()
	{
		return real;
	}
	public double getImag()
	{
		return imag;
	}
	public double getMagnitude()
	{
		return r;
	}
	public double getTheta()
	{
		return theta;
	}
	public void setReal(double real)
	{
		this.real = real;
	}
	public void setImag(double imag)
	{
		this.imag = imag;
	}
	public ComplexArr plus(ComplexArr a)
	{	
		//add a complex number to this complex number. return a ComplexNum
		ComplexArr answer = new ComplexArr();
		answer.setReal(this.real + a.getReal());
		answer.setImag(this.imag + a.getImag());
		return answer;
	}
	public ComplexArr minus(ComplexArr a)
	{
		//subtract
		ComplexArr answer = new ComplexArr();
		answer.setReal(this.real - a.getReal());
		answer.setImag(this.imag - a.getImag());
		return answer;
	}
	
	public ComplexArr times(ComplexArr a)
	{
		//multiply
		ComplexArr answer = new ComplexArr();
		answer.setReal(this.real*a.getReal() - this.imag*a.getImag());
		answer.setImag(this.real*a.getImag() + this.imag*a.getReal());
		return answer;
	}
	public ComplexArr conjugate()
	{
		//return the complex conjugate
		this.imag = this.imag*(-1);
		return this;
	}
	public ComplexArr rationalize()
	{
		//return the rationalized version of this complex number
		ComplexArr answer = new ComplexArr();
		answer.setReal((this.real)/(this.real*this.real + this.imag*this.imag));
		answer.setImag((this.imag)/(this.real*this.real + this.imag*this.imag)*(-1));
		return answer;
	}
	public void polarize()
	{
		this.r = Math.sqrt((this.real)*(this.real) + (this.imag)*(this.imag));
		this.theta = Math.atan((this.imag)/(this.real));
	}
	public boolean equals(ComplexArr second)
	{
		if(Math.abs(this.r - second.getMagnitude()) < .001)
			return true;
		else
			return false;
	}
	public int compareTo(ComplexArr second)
	{
		if(this.equals(second)) 
			return 0;
		else if(this.r < second.getMagnitude()) 
			return -1;
		else 
			return 1;
	}
	public String toString()
	{
		//return a string in the form a+bi
		String out = "";
		if(this.imag >= 0)
			out = out + real + " + " + imag + "i";
		else if(this.imag < 0)
			out = out + real + " - " + imag*(-1) + "i";
		return (out);
	}
}