package all;

public class ClonePair3861 {

    double method1(double[] v1,double[] v2){
      double r=0;
      for (int i=0; i < v1.length; ++i) {
        r+=v1[i] * v2[i];
      }
      return r;
    }

    double method2(double[] w0,double[] w1){
      double sortie=0.0;
      for (int k=0; k < w0.length; k++) {
        sortie+=w0[k] * w1[k];
      }
      return (sortie);
    }
}
