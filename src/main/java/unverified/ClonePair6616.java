package unverified;

public class ClonePair6616 {

    double method1(double base,int exponent){
      double product=1.0;
      if (exponent < 0) {
        for (; exponent != 0; exponent++)     product*=base;
        return 1.0 / product;
      }
     else {
        for (; exponent != 0; exponent--)     product*=base;
        return product;
      }
    }

    double method2(double a,int n){
      double x;
      x=1.;
      if (n > 0)   for (; n > 0; n--)   x*=a;
     else   for (; n < 0; n++)   x/=a;
      return x;
    }
}
