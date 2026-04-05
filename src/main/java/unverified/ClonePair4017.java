package unverified;

public class ClonePair4017 {

    double method1(double x,double y){
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
