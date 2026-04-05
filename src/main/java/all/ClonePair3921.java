package all;

public class ClonePair3921 {

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

    double method2(double logX,double logY){
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
}
