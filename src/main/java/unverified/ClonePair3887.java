package unverified;

public class ClonePair3887 {

    double method1(double lp1,double lp2){
      if (lp1 >= lp2) {
        return lp1 + Math.log1p(Math.exp(lp2 - lp1));
      }
     else {
        return lp2 + Math.log1p(Math.exp(lp1 - lp2));
      }
    }

    double method2(double x,double y){
      if (x == Double.NEGATIVE_INFINITY)   return y;
      if (y == Double.NEGATIVE_INFINITY)   return x;
      if (y <= x)   return x + Math.log(1 + Math.exp(y - x));
     else   return y + Math.log(1 + Math.exp(x - y));
    }
}
