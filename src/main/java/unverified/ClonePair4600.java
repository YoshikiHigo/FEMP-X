package unverified;

public class ClonePair4600 {

    double method1(double[] x){
      if (x.length == 0)   return Double.NaN;
      double min=Double.MAX_VALUE;
      for (  double v : x) {
        if (min > v)     min=v;
      }
      return min;
    }

    double method2(double[] values){
      double min=Double.NaN;
      if (values.length > 0) {
        min=values[0];
        for (int i=values.length; --i >= 1; ) {
          if (values[i] < min) {
            min=values[i];
          }
        }
      }
      return min;
    }
}
