package all;

public class ClonePair3892 {

    double method1(double lp1,double lp2){
      if (lp1 >= lp2) {
        return lp1 + Math.log1p(Math.exp(lp2 - lp1));
      }
     else {
        return lp2 + Math.log1p(Math.exp(lp1 - lp2));
      }
    }

    double method2(double a,double b){
      if (a == Double.NEGATIVE_INFINITY)   return b;
     else   if (b == Double.NEGATIVE_INFINITY)   return a;
     else   if (b < a)   return a + Math.log(1 + Math.exp(b - a));
     else   return b + Math.log(1 + Math.exp(a - b));
    }
}
