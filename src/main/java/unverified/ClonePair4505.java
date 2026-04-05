package unverified;

public class ClonePair4505 {

    double method1(double[] A){
      double max=A[0];
      for (int i=0; i < A.length; i++) {
        max=(max > A[i] ? max : A[i]);
      }
      return max;
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
