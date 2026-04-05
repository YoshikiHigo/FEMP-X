package all;

public class ClonePair131 {

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

    double method2(double value,double min,double max){
      if (value <= max && value >= min) {
        return value;
      }
     else   if (max < value) {
        return max;
      }
     else {
        return min;
      }
    }
}
