package all;

public class ClonePair105 {

    double method1(double a,double lo,double hi){
      if (a <= lo)   return lo;
     else   if (a >= hi)   return hi;
     else   return a;
    }

    double method2(double x,double min,double max){
      if (x < min) {
        return min;
      }
      if (x > max) {
        return max;
      }
      return (float)x;
    }
}
