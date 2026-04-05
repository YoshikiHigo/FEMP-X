package all;

public class ClonePair4467 {

    double method1(double[] x){
      if (x.length == 0)   return Double.NaN;
      double total=0;
      for (  double v : x) {
        total+=v;
      }
      return total / x.length;
    }

    double method2(double[] individuals){
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
}
