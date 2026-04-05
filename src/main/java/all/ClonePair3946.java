package all;

public class ClonePair3946 {

    double method1(double n,double m){
      if (m == 0)   return n;
      byte mPositive=1;
      if (m < 0) {
        mPositive=-1;
        m=-m;
        n=-n;
      }
      return (n >= 0) ? n % m * mPositive : (m + n % m) % m * mPositive;
    }

    double method2(double divider,double quotient){
      if (quotient == 0) {
        return divider;
      }
      double ret=divider % quotient;
      if ((ret >= 0 && quotient < 0) || (ret < 0 && quotient >= 0)) {
        ret+=quotient;
      }
      return ret;
    }
}
