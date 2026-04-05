package unverified;

public class ClonePair130 {

    double method1(double value,double lb,double ub){
      if (value < lb) {
        return lb;
      }
     else   if (value > ub) {
        return ub;
      }
     else {
        return value;
      }
    }

    double method2(double val,double lowerBound,double upperBound){
      if (lowerBound == upperBound) {
        return lowerBound;
      }
      if (val < lowerBound) {
        return lowerBound;
      }
      if (val > upperBound) {
        return upperBound;
      }
      return val;
    }
}
