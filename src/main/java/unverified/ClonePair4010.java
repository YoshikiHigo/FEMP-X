package unverified;

public class ClonePair4010 {

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
