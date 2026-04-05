package all;

public class ClonePair4470 {

    double method1(double[] x){
      if (x.length == 0)   return Double.NaN;
      double total=0;
      for (  double v : x) {
        total+=v;
      }
      return total / x.length;
    }

    double method2(double[] values){
      if (values.length == 0) {
        return Double.NaN;
      }
      double sum=0;
      for (  double d : values) {
        sum+=d;
      }
      return sum / values.length;
    }
}
