package all;

public class ClonePair4055 {

    double method1(double re,double im){
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
