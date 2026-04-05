package unverified;

public class ClonePair4492 {

    double method1(double[] individuals){
      double sum=0.0;
      int count=0;
      for (int n=0; n < individuals.length; n++) {
        if (!Double.isNaN(individuals[n]) && !Double.isInfinite(individuals[n])) {
          sum+=individuals[n];
          count++;
        }
      }
      return sum / (double)count;
    }

    double method2(double[] values){
      if (values.length == 0)   return Double.NaN;
      double mean=0;
      for (  double value : values)   mean+=value;
      return mean / values.length;
    }
}
