package unverified;

public class ClonePair4608 {

    double method1(double[] values){
      double min=values[0];
      for (int f=0; f < values.length; f++)   if (values[f] < min)   min=values[f];
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
