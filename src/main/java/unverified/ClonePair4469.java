package unverified;

public class ClonePair4469 {

    double method1(double[] x){
      if (x.length == 0)   return Double.NaN;
      double total=0;
      for (  double v : x) {
        total+=v;
      }
      return total / x.length;
    }

    double method2(double[] values){
      if (values.length == 0)   return Double.NaN;
      double mean=0;
      for (  double value : values)   mean+=value;
      return mean / values.length;
    }
}
