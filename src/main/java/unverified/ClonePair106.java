package unverified;

public class ClonePair106 {

    double method1(double a,double lo,double hi){
      if (a <= lo)   return lo;
     else   if (a >= hi)   return hi;
     else   return a;
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
