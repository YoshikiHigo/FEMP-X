package unverified;

public class ClonePair4796 {

    double method1(double[] array){
      double min=array[0];
      for (  double d : array)   if (d < min)   min=d;
      return min;
    }

    double method2(double[] A){
      double min=A[0];
      for (int i=0; i < A.length; i++) {
        min=(min < A[i] ? min : A[i]);
      }
      return min;
    }
}
