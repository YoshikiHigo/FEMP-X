package all;

public class ClonePair126 {

    double method1(double x,double min,double max){
      if (x < min) {
        return min;
      }
      if (x > max) {
        return max;
      }
      return (float)x;
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
