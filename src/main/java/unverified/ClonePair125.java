package unverified;

public class ClonePair125 {

    double method1(double x,double min,double max){
      if (x < min) {
        return min;
      }
      if (x > max) {
        return max;
      }
      return (float)x;
    }

    double method2(double value,double lb,double ub){
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
}
