package all;

public class ClonePair3855 {

    double method1(double[] a,double[] b){
      double r=0;
      for (int i=0; i < a.length; i++)   r+=a[i] * b[i];
      return r;
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
