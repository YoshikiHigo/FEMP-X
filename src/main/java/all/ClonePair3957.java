package all;

public class ClonePair3957 {

    double method1(double aa,double bb){
      double cc=0.0D, ratio=0.0D;
      double amod=Math.abs(aa);
      double bmod=Math.abs(bb);
      if (amod == 0.0D) {
        cc=bmod;
      }
     else {
        if (bmod == 0.0D) {
          cc=amod;
        }
     else {
          if (amod <= bmod) {
            ratio=amod / bmod;
            cc=bmod * Math.sqrt(1.0D + ratio * ratio);
          }
     else {
            ratio=bmod / amod;
            cc=amod * Math.sqrt(1.0D + ratio * ratio);
          }
        }
      }
      return cc;
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
