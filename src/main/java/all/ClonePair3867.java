package all;

public class ClonePair3867 {

    double method1(double[] v1,double[] v2){
      double r=0;
      for (int i=0; i < v1.length; ++i) {
        r+=v1[i] * v2[i];
      }
      return r;
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
