package unverified;

public class ClonePair3845 {

    double method1(double[] m1,double[] m2){
      double res=0.0;
      for (int i=0; i < m1.length; i++) {
        res+=m1[i] * m2[i];
      }
      return res;
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
