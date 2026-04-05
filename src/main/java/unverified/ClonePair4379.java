package unverified;

public class ClonePair4379 {

    double method1(double x,double y){
      if (x == Double.NEGATIVE_INFINITY)   return y;
      if (y == Double.NEGATIVE_INFINITY)   return x;
      if (y <= x)   return x + Math.log(1 + Math.exp(y - x));
     else   return y + Math.log(1 + Math.exp(x - y));
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
