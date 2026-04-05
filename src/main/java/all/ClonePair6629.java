package all;

public class ClonePair6629 {

    double method1(double base,int exponent){
    switch (exponent) {
    case 0:    return 1.0;
    case 1:  return base;
    case 2:return base * base;
    case 3:return base * base * base;
    case 4:return base * base * base* base;
    default:return Math.pow(base,exponent);
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
