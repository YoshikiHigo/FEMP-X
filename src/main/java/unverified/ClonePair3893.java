package unverified;

public class ClonePair3893 {

    double method1(double lp1,double lp2){
      if (lp1 >= lp2) {
        return lp1 + Math.log1p(Math.exp(lp2 - lp1));
      }
     else {
        return lp2 + Math.log1p(Math.exp(lp1 - lp2));
      }
    }

    double method2(double logOfX,double logOfY){
      if (Double.isNaN(logOfX)) {
        return logOfY;
      }
      if (Double.isNaN(logOfY)) {
        return logOfX;
      }
      if (logOfX > logOfY) {
        return logOfX + Math.log(1 + Math.exp(logOfY - logOfX));
      }
     else {
        return logOfY + Math.log(1 + Math.exp(logOfX - logOfY));
      }
    }
}
