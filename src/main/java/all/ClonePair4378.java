package all;

public class ClonePair4378 {

    double method1(double x,double y){
      if (x == Double.NEGATIVE_INFINITY)   return y;
      if (y == Double.NEGATIVE_INFINITY)   return x;
      if (y <= x)   return x + Math.log(1 + Math.exp(y - x));
     else   return y + Math.log(1 + Math.exp(x - y));
    }

    double method2(double a,double b){
      if (a == Double.NEGATIVE_INFINITY)   return b;
     else   if (b == Double.NEGATIVE_INFINITY)   return a;
     else   if (b < a)   return a + Math.log(1 + Math.exp(b - a));
     else   return b + Math.log(1 + Math.exp(a - b));
    }
}
