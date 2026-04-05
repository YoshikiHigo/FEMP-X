package all;

public class ClonePair127 {

    double method1(double x,double min,double max){
      if (x < min) {
        return min;
      }
      if (x > max) {
        return max;
      }
      return (float)x;
    }

    double method2(double x,double min,double max){
      if (x < min)   return min;
      if (x > max)   return max;
      return x;
    }
}
