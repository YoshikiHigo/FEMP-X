package unverified;

public class ClonePair4356 {

    double method1(double a,double b){
      if (a == Double.NEGATIVE_INFINITY && b == Double.NEGATIVE_INFINITY)   return Double.NEGATIVE_INFINITY;
     else   if (a > b)   return a + Math.log(1 + Math.exp(b - a));
     else   return b + Math.log(1 + Math.exp(a - b));
    }

    double method2(double a,double b){
      if (a == Double.NEGATIVE_INFINITY)   return b;
     else   if (b == Double.NEGATIVE_INFINITY)   return a;
     else   if (b < a)   return a + Math.log(1 + Math.exp(b - a));
     else   return b + Math.log(1 + Math.exp(a - b));
    }
}
