package unverified;

public class ClonePair3959 {

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

    double method2(double re,double im){
      double ans=0.;
      re=Math.abs(re);
      im=Math.abs(im);
      if (re == 0.0)   ans=im;
     else   if (im == 0.0)   ans=re;
     else   if (re > im) {
        double temp=im / re;
        ans=re * Math.sqrt(1. + temp * temp);
      }
     else {
        double temp=re / im;
        ans=im * Math.sqrt(1. + temp * temp);
      }
      return ans;
    }
}
