package all;

public class ClonePair4783 {

    double method1(double[] verteces){
      double l;
      l=verteces[0];
      for (int i=0; i < verteces.length; i++) {
        if (verteces[i] < l) {
          l=verteces[i];
        }
      }
      return l;
    }

    double method2(double[] A){
      double min=A[0];
      for (int i=0; i < A.length; i++) {
        min=(min < A[i] ? min : A[i]);
      }
      return min;
    }
}
