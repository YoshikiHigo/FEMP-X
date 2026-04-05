package all;

public class ClonePair991 {

    boolean method1(double y0,double y1,double epsilon){
      if (Math.abs(y0) > 1.0 && Math.abs(y1) > 1.0) {
        epsilon*=Math.abs(y1);
      }
      return Math.abs(y0 - y1) < epsilon;
    }

    boolean method2(double value1,double value2,double tolerance){
      if ((Math.abs(value1) < tolerance && Math.abs(value2) < tolerance) || (value1 == 0 && Math.abs(value2) < tolerance) || (value2 == 0 && Math.abs(value1) < tolerance))   return true;
      return false;
    }
}
