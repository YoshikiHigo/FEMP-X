package all;

public class ClonePair110 {

    double method1(double value,double lower,double upper){
      double newValue=value;
      while (newValue < lower || newValue > upper) {
        if (newValue < lower) {
          newValue=lower + (lower - newValue);
        }
        if (newValue > upper) {
          newValue=upper - (newValue - upper);
        }
      }
      return newValue;
    }

    double method2(double value,double lower,double upper){
      double newValue=value;
      if (value < lower) {
        if (Double.isInfinite(upper)) {
          newValue=lower + (lower - value);
        }
     else {
          double remainder=lower - value;
          double widths=Math.floor(remainder / (upper - lower));
          remainder-=(upper - lower) * widths;
          if (widths % 2 == 0) {
            newValue=lower + remainder;
          }
     else {
            newValue=upper - remainder;
          }
        }
      }
     else   if (value > upper) {
        if (Double.isInfinite(lower)) {
          newValue=upper - (newValue - upper);
        }
     else {
          double remainder=value - upper;
          double widths=Math.floor(remainder / (upper - lower));
          remainder-=(upper - lower) * widths;
          if (widths % 2 == 0) {
            newValue=upper - remainder;
          }
     else {
            newValue=lower + remainder;
          }
        }
      }
      return newValue;
    }
}
