package unverified;

public class ClonePair4473 {

    double method1(double[] arrFunc){
      double dblMax=arrFunc[0];
      for (int index=0; index < arrFunc.length; index++)   if (arrFunc[index] > dblMax) {
        dblMax=arrFunc[index];
      }
      return dblMax;
    }

    double method2(double[] A){
      double max=A[0];
      for (int i=0; i < A.length; i++) {
        max=(max > A[i] ? max : A[i]);
      }
      return max;
    }
}
