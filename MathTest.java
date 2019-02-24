public class MathTest
{

  public static void main(String[] args) 
  {
  	  
    int i = -6;
    int j = 7;
    double x = 12.3;
    double y = 0.45;
  
    System.out.println( "i = " + i );     
    System.out.println( "j = " + j );
    System.out.println( "x = " + x );     
    System.out.println( "y = " + y );
     
    // Absolute values
    System.out.println( "|" + i + "| = " + Math.abs(i) );     
    System.out.println( "|" + j + "| = " + Math.abs(j) );
    System.out.println( "|" + x + "| = " + Math.abs(x) );     
    System.out.println( "|" + y + "| = " + Math.abs(y) );

    // Truncating (Rounding) is getting the nearest value
    System.out.println( x + " is approximately " + Math.round(x) );     
    System.out.println( y + " is approximately " + Math.round(y) );

    // The "ceiling" is the next greater integer
    System.out.println( "The ceiling of " + x + " = " + Math.ceil(x) );     
    System.out.println( "The ceiling of " + y + " = " + Math.ceil(y) );

    // The "floor" is the next smaller integer
    System.out.println( "The floor of " + x + " = " + Math.floor(x) );     
    System.out.println( "The floor of " + y + " = " + Math.floor(y) );

    // Comparison operators
    System.out.println( "min(" + i + "," + j + ") = " + Math.min(i,j) );     
    System.out.println( "max(" + x + "," + y + ") = " + Math.max(x,y) );     
      
    // PI constant
    System.out.println( "PI = " + Math.PI);     

    // x^y
    System.out.println( "pow(" + i + "," + j + ") = " + Math.pow(i,j) );

    // sqrt
    System.out.println( "sqrt(" + j + ") = " + Math.sqrt(j) );
    System.out.println( "sqrt(" + x + ") = " + Math.sqrt(x) );

    // random in [0.0 ... 1.0]
    System.out.println( "random number between 0.0 and 1.0 = " + Math.random() );     
    System.out.println( "random number between 0 and 10 = " + Math.round( Math.random() * 10 ) );     
    System.out.println( "random number between 0 and 100 = " + Math.round( Math.random() * 100 ) );     

  }

}

