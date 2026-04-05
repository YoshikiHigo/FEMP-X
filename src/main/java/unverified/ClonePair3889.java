package unverified;

public class ClonePair3889 {

    double method1(double[] w0,double[] w1){
      double sortie=0.0;
      for (int k=0; k < w0.length; k++) {
        sortie+=w0[k] * w1[k];
      }
      return (sortie);
    }

    double method2(double[] ovx,double[] ovy){
      double ddot=0.0;
      if (ovx.length <= 0) {
        return ddot;
      }
      for (int i=0; i < ovx.length; i++) {
        ddot+=ovx[i] * ovy[i];
      }
      return ddot;
    }
}
