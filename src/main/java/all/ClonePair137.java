package all;

public class ClonePair137 {

    double method1(double x,double min,double max){
      if (x < min)   return min;
      if (x > max)   return max;
      return x;
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
