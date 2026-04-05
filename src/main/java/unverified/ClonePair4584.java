package unverified;

public class ClonePair4584 {

    double method1(double[] d){
      double high=d[0];
      for (int k=1; k < d.length; k++) {
        if (d[k] > high) {
          high=d[k];
        }
      }
      return high;
    }

    double method2(double[] x){
      double max=x[0];
      for (  double xi : x) {
        if (xi > max) {
          max=xi;
        }
      }
      return max;
    }
}
