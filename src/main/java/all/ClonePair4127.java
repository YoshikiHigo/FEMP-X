package all;

public class ClonePair4127 {

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

    double method2(double x,double y){
      if (x == Double.NEGATIVE_INFINITY)   return y;
      if (y == Double.NEGATIVE_INFINITY)   return x;
      if (y <= x)   return x + Math.log(1 + Math.exp(y - x));
     else   return y + Math.log(1 + Math.exp(x - y));
    }
}
