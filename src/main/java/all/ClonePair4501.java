package all;

public class ClonePair4501 {

    double method1(double[] A){
      double max=A[0];
      for (int i=0; i < A.length; i++) {
        max=(max > A[i] ? max : A[i]);
      }
      return max;
    }

    double method2(double[] array){
      double max=array[0];
      for (int i=1; i < array.length; i++) {
        if (array[i] > max)     max=array[i];
      }
      return max;
    }
}
