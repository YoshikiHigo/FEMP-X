package all;

public class ClonePair4554 {

    double method1(double a,double b){
      if (a == Double.NEGATIVE_INFINITY)   return b;
     else   if (b == Double.NEGATIVE_INFINITY)   return a;
     else   if (b < a)   return a + Math.log(1 + Math.exp(b - a));
     else   return b + Math.log(1 + Math.exp(a - b));
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
