public class taleOfTwoClasses 
{
	public static void main(String[] args) 
	{
		FieldMice fm1 = new FieldMice(3, "Mickey Mouse");
		FieldMice fm2 = new FieldMice(10, "Harry");
		FieldMice fm3 = fm2;
		
		BunnyFoo bf1 = new BunnyFoo(5, "Bugs Bunny");
		BunnyFoo bf2 = new BunnyFoo(7, "Lily");
		
		System.out.println("fm1 is " + fm1);
		System.out.println("hashcode for fm1 is "+ fm1.hashCode());
		System.out.println("fieldmice 1 and 2 are equal? " + fm1.equals(fm2));
		System.out.println("fieldmice 2 and 3 are equal? " + fm2.equals(fm3));
		
		System.out.println("bf1 is " + bf1);	
		System.out.println("bf1 and bf2 are equal? " + bf1.equals(bf2));
		
		System.out.println(fm1.getClass());
		System.out.println(fm2.getClass());
		System.out.println(fm3.getClass());
		System.out.println(bf1.getClass());
		System.out.println(bf2.getClass());
	}
}