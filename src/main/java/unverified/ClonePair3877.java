package unverified;

public class ClonePair3877 {

    double method1(double[] v1,double[] v2){
      final int m=v1.length;
      double sum=0;
      for (int r=0; r < m; r++) {
        sum+=v1[r] * v2[r];
      }
      return sum;
    }

    double method2(double[] w0,double[] w1){
      double sortie=0.0;
      for (int k=0; k < w0.length; k++) {
        sortie+=w0[k] * w1[k];
      }
      return (sortie);
    }
}
