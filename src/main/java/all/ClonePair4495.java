package all;

public class ClonePair4495 {

    double method1(double[] A){
      double max=A[0];
      for (int i=0; i < A.length; i++) {
        max=(max > A[i] ? max : A[i]);
      }
      return max;
    }

    double method2(double[] a){
      double b=a[0];
      for (int i=0; i < a.length; i++)   if (a[i] > b)   b=a[i];
      return b;
    }
}
