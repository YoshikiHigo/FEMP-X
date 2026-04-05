package all;

public class ClonePair4596 {

    double method1(double[] arrFunc){
      double dblMin=arrFunc[0];
      for (int index=0; index < arrFunc.length; index++)   if (arrFunc[index] < dblMin) {
        dblMin=arrFunc[index];
      }
      return dblMin;
    }

    double method2(double[] A){
      double min=A[0];
      for (int i=0; i < A.length; i++) {
        min=(min < A[i] ? min : A[i]);
      }
      return min;
    }
}
