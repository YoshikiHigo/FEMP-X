package all;

public class ClonePair3841 {

    double method1(double[] m1,double[] m2){
      double res=0.0;
      for (int i=0; i < m1.length; i++) {
        res+=m1[i] * m2[i];
      }
      return res;
    }

    double method2(double[] v1,double[] v2){
      double r=0;
      for (int i=0; i < v1.length; ++i) {
        r+=v1[i] * v2[i];
      }
      return r;
    }
}
