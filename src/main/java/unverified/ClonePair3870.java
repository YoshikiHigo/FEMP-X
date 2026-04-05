package unverified;

public class ClonePair3870 {

    double method1(double x,double y){
      final double xAbs=Math.abs(x);
      final double yAbs=Math.abs(y);
      if (xAbs == 0.0 && yAbs == 0.0)   return 0.0;
     else   if (xAbs < yAbs)   return yAbs * Math.sqrt(1.0 + (x / y) * (x / y));
     else   return xAbs * Math.sqrt(1.0 + (y / x) * (y / x));
    }

    double method2(double x,double y){
      if (x < 0.) {
        x=-x;
      }
     else   if (x == 0.) {
        return (y < 0.0 ? -y : y);
      }
      if (y < 0.) {
        y=-y;
      }
     else   if (y == 0.) {
        return (x);
      }
      if (x < y) {
        x/=y;
        return (y * Math.sqrt(1.0 + x * x));
      }
     else {
        y/=x;
        return (x * Math.sqrt(1.0 + y * y));
      }
    }
}
