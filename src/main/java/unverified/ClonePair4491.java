package unverified;

public class ClonePair4491 {

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

    double method2(double[] series){
      double res=0D;
      int count=0;
      for (  double tp : series) {
        if (Double.isNaN(tp) || Double.isInfinite(tp)) {
          continue;
        }
     else {
          res+=tp;
          count+=1;
        }
      }
      if (count > 0) {
        return res / ((Integer)count).doubleValue();
      }
      return Double.NaN;
    }
}
