package unverified;

public class ClonePair4642 {

    double method1(double[] v){
      double max=v[0];
      for (int i=1; i < v.length; i++) {
        if (max < v[i]) {
          max=v[i];
        }
      }
      return (max);
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
