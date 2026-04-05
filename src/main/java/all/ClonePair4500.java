package all;

public class ClonePair4500 {

    double method1(double[] A){
      double max=A[0];
      for (int i=0; i < A.length; i++) {
        max=(max > A[i] ? max : A[i]);
      }
      return max;
    }

    double method2(double[] verteces){
      double r;
      r=verteces[0];
      for (int i=0; i < verteces.length; i++) {
        if (verteces[i] > r) {
          r=verteces[i];
        }
      }
      return r;
    }
}
