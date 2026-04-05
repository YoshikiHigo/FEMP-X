package all;

public class ClonePair3856 {

    double method1(double[] a,double[] b){
      double r=0;
      for (int i=0; i < a.length; i++)   r+=a[i] * b[i];
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
