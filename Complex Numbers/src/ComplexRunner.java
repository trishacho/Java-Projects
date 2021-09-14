public class ComplexRunner 
{
	public static void main(String[] args) 
	{
		ComplexNum x = new ComplexNum (3,4);
		ComplexNum y = new ComplexNum(9,-1);
		
		ComplexNum z = x.plus(y);
		System.out.println(z);
		
		z = y.minus(x);
		System.out.println(z);
		
		z = y.times(x);
		System.out.println(z);
		
		//System.out.println(z.conjugate());
		System.out.println(z.rationalize());
		System.out.println(z.polarize());
	}
}