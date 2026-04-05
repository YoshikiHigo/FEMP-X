package all;

public class ClonePair4644 {

    double method1(double[] values){
      if (values.length == 0)   return Double.NaN;
      double mean=0;
      for (  double value : values)   mean+=value;
      return mean / values.length;
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
