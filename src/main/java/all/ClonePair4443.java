package all;

public class ClonePair4443 {

    double method1(double[] x){
      if (x.length == 0)   return Double.NaN;
      double max=-Double.MAX_VALUE;
      for (  double v : x) {
        if (max < v)     max=v;
      }
      return max;
    }

    double method2(double[] values){
      double max=Double.NaN;
      if (values.length > 0) {
        max=values[0];
        for (int i=values.length; --i >= 1; ) {
          if (values[i] > max) {
            max=values[i];
          }
        }
      }
      return max;
    }
}
