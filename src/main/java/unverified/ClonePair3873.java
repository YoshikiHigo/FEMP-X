package unverified;

public class ClonePair3873 {

    double method1(double x,double y){
      final double xAbs=Math.abs(x);
      final double yAbs=Math.abs(y);
      if (xAbs == 0.0 && yAbs == 0.0)   return 0.0;
     else   if (xAbs < yAbs)   return yAbs * Math.sqrt(1.0 + (x / y) * (x / y));
     else   return xAbs * Math.sqrt(1.0 + (y / x) * (y / x));
    }

    double method2(double a,double b){
      double r;
      if (Math.abs(a) > Math.abs(b)) {
        r=b / a;
        r=Math.abs(a) * Math.sqrt(1 + r * r);
      }
     else   if (b != 0) {
        r=a / b;
        r=Math.abs(b) * Math.sqrt(1 + r * r);
      }
     else   r=0.0;
      return r;
    }
}
