package all;

public class ClonePair4352 {

    double method1(double a,double b){
      if (a == Double.NEGATIVE_INFINITY && b == Double.NEGATIVE_INFINITY)   return Double.NEGATIVE_INFINITY;
     else   if (a > b)   return a + Math.log(1 + Math.exp(b - a));
     else   return b + Math.log(1 + Math.exp(a - b));
    }

    double method2(double x,double y){
      if (x == Double.NEGATIVE_INFINITY)   return y;
      if (y == Double.NEGATIVE_INFINITY)   return x;
      if (y <= x)   return x + Math.log(1 + Math.exp(y - x));
     else   return y + Math.log(1 + Math.exp(x - y));
    }
}
