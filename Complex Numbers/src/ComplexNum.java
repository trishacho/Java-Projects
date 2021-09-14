public class ComplexNum 
{
	private double real; // real part
	private double imag; //imaginary part
	public ComplexNum()
	{
		real = imag = 0;
	}
	public ComplexNum(double real, double imag)
	{
		this.real = real;
		this.imag = imag;
	}
	public double getReal()
	{
		return real;
	}
	public double getImag()
	{
		return imag;
	}
	public void setReal(double real)
	{
		this.real = real;
	}
	public void setImag(double imag)
	{
		this.imag = imag;
	}
	public ComplexNum plus(ComplexNum a)
	{	
		//add a complex number to this complex number. return a ComplexNum
		ComplexNum answer = new ComplexNum();
		answer.setReal(this.real + a.getReal());
		answer.setImag(this.imag + a.getImag());
		return answer;
	}
	public ComplexNum minus(ComplexNum a)
	{
		//subtract
		ComplexNum answer = new ComplexNum();
		answer.setReal(this.real - a.getReal());
		answer.setImag(this.imag - a.getImag());
		return answer;
	}
	
	public ComplexNum times(ComplexNum a)
	{
		//multiply
		ComplexNum answer = new ComplexNum();
		answer.setReal(this.real*a.getReal() - this.imag*a.getImag());
		answer.setImag(this.real*a.getImag() + this.imag*a.getReal());
		return answer;
	}
	public ComplexNum conjugate()
	{
		//return the complex conjugate
		this.imag = this.imag*(-1);
		return this;
	}
	public ComplexNum rationalize()
	{
		//return the rationalized version of this complex number
		ComplexNum answer = new ComplexNum();
		answer.setReal((this.real)/(this.real*this.real + this.imag*this.imag));
		answer.setImag((this.imag)/(this.real*this.real + this.imag*this.imag)*(-1));
		return answer;
	}
	public String polarize()
	{
		String out = "";
		//return the polar form of this complex number
		double magnitude = Math.sqrt((this.real)*(this.real) + (this.imag)*(this.imag));
		double theta = Math.atan((this.imag)/(this.real));
		out = out + magnitude + "(cos(" + theta + ") + isin(" + theta + "))";
		return out;
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