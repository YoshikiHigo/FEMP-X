package all;

public class ClonePair3886 {

    double method1(double[] w0,double[] w1){
      double sortie=0.0;
      for (int k=0; k < w0.length; k++) {
        sortie+=w0[k] * w1[k];
      }
      return (sortie);
    }

    double method2(double[] value1,double[] value2){
      double sum=0.0;
      for (int i=0; i < value1.length; i++) {
        double v1=value1[i];
        double v2=value2[i];
        if ((!Double.isNaN(v1)) && (!Double.isNaN(v2))) {
          sum=sum + v2 * v1;
        }
      }
      return sum;
    }
}
