package unverified;

public class ClonePair4821 {

    double method1(double[] A){
      double min=A[0];
      for (int i=0; i < A.length; i++) {
        min=(min < A[i] ? min : A[i]);
      }
      return min;
    }

    double method2(double[] array){
      double min=array[0];
      for (int i=1; i < array.length; i++) {
        if (array[i] < min)     min=array[i];
      }
      return min;
    }
}
