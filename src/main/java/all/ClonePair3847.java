package all;

public class ClonePair3847 {

    double method1(double[] m1,double[] m2){
      double res=0.0;
      for (int i=0; i < m1.length; i++) {
        res+=m1[i] * m2[i];
      }
      return res;
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
