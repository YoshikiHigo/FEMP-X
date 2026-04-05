package unverified;

public class ClonePair3960 {

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
