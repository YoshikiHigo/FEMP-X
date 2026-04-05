package unverified;

public class ClonePair3978 {

    double method1(double x,double y){
      double angle;
      if (x < 0) {
        angle=Math.PI + Math.atan(y / x);
      }
     else {
        angle=Math.atan(y / x);
        if (y < 0) {
          angle=angle + 2 * Math.PI;
        }
      }
      return angle;
    }

    double method2(double x,double y){
      double theta=Math.acos(x / Math.sqrt(x * x + y * y));
      if (x < 0 && y < 0) {
        theta=2.0 * Math.PI - theta;
      }
     else   if (x > 0 && y < 0) {
        theta=2.0 * Math.PI - theta;
      }
      return theta;
    }
}
