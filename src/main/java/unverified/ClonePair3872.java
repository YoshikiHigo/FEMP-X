package unverified;

public class ClonePair3872 {

    double method1(double x,double y){
      final double xAbs=Math.abs(x);
      final double yAbs=Math.abs(y);
      if (xAbs == 0.0 && yAbs == 0.0)   return 0.0;
     else   if (xAbs < yAbs)   return yAbs * Math.sqrt(1.0 + (x / y) * (x / y));
     else   return xAbs * Math.sqrt(1.0 + (y / x) * (y / x));
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
