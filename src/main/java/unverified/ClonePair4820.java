package unverified;

public class ClonePair4820 {

    double method1(double[] A){
      double min=A[0];
      for (int i=0; i < A.length; i++) {
        min=(min < A[i] ? min : A[i]);
      }
      return min;
    }

    double method2(double[] d){
      double low=d[0];
      for (int k=1; k < d.length; k++) {
        if (d[k] < low) {
          low=d[k];
        }
      }
      return low;
    }
}
