  public class TriangleTester {

    public static void main(String[] args) {
      Triangle abc = new Triangle (2,1,2,5,6,3);
      System.out.println(abc.toString());
      
      abc.reflectX();
      System.out.println(abc.toString());
      
      abc.reflectY();
      System.out.println(abc.toString());
      
      System.out.println(abc.area());
      System.out.println(abc.perimeter());
      
      abc.dilate(3);
      System.out.println(abc.toString());
      
      Triangle def= new Triangle(2,2,2,4,6,8);
      System.out.println(def.toString());
      System.out.println(def.area());
      System.out.println(def.perimeter());
      
      double x = 3.1284;
      double y = (x+.005)*100;
    
      double i1 = ((int)(y))/100.0;
      System.out.println(i1);
      System.out.printf("round x %.2f%n",x);
      
    }

  }