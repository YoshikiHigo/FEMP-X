package all;

public class ClonePair4494 {

    double method1(double[] A){
      double max=A[0];
      for (int i=0; i < A.length; i++) {
        max=(max > A[i] ? max : A[i]);
      }
      return max;
    }

    double method2(double[] d){
      double high=d[0];
      for (int k=1; k < d.length; k++) {
        if (d[k] > high) {
          high=d[k];
        }
      }
      return high;
    }
}
