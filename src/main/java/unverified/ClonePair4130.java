package unverified;

public class ClonePair4130 {

    double method1(double logX,double logY){
      if (logY > logX) {
        double temp=logX;
        logX=logY;
        logY=temp;
      }
      if (logX == Double.NEGATIVE_INFINITY) {
        return logX;
      }
      double negDiff=logY - logX;
      if (negDiff < -20) {
        return logX;
      }
      return logX + Math.log(1.0 + Math.exp(negDiff));
    }

    double method2(double a,double b){
      if (a == Double.NEGATIVE_INFINITY)   return b;
     else   if (b == Double.NEGATIVE_INFINITY)   return a;
     else   if (b < a)   return a + Math.log(1 + Math.exp(b - a));
     else   return b + Math.log(1 + Math.exp(a - b));
    }
}
