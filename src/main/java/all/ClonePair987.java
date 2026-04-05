package all;

public class ClonePair987 {

    boolean method1(double a,double b,double tolerance){
      double denom=0.5 * (Math.abs(a) + Math.abs(b));
      if (denom < 1) {
        return (Math.abs(a - b) <= tolerance);
      }
     else {
        return (Math.abs(a - b) / denom <= tolerance);
      }
    }

    boolean method2(double result,double expected,double relative_error){
      if (Double.isNaN(result))   return Double.isNaN(expected);
     else   if (Double.isInfinite(expected))   return result == expected;
     else   if (expected != 0) {
        if (StrictMath.abs(result - expected) / StrictMath.abs(expected) <= relative_error) {
          return true;
        }
     else {
          System.out.print("Relative error = ");
          System.out.print(StrictMath.abs(result - expected) / StrictMath.abs(expected));
          System.out.print(" ");
          return false;
        }
      }
     else {
        if (StrictMath.abs(result) <= relative_error) {
          return true;
        }
     else {
          System.out.print("Absolute error = ");
          System.out.print(StrictMath.abs(result));
          System.out.print(" ");
          return false;
        }
      }
    }
}
