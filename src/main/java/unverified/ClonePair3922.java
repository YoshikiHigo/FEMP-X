package unverified;

public class ClonePair3922 {

    double method1(double lp1,double lp2){
      if (lp1 == Double.NEGATIVE_INFINITY) {
        return lp2;
      }
      if (lp2 == Double.NEGATIVE_INFINITY) {
        return lp1;
      }
      if (lp1 >= lp2) {
        double diff=lp2 - lp1;
        return lp1 + Math.log1p(Math.exp(diff));
      }
     else {
        return lp2 + Math.log1p(Math.exp(lp1 - lp2));
      }
    }

    double method2(double a,double b){
      if (a == Double.NEGATIVE_INFINITY && b == Double.NEGATIVE_INFINITY)   return Double.NEGATIVE_INFINITY;
     else   if (a > b)   return a + Math.log(1 + Math.exp(b - a));
     else   return b + Math.log(1 + Math.exp(a - b));
    }
}
