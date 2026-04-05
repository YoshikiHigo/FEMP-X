package unverified;

public class ClonePair4582 {

    double method1(double[] d){
      double high=d[0];
      for (int k=1; k < d.length; k++) {
        if (d[k] > high) {
          high=d[k];
        }
      }
      return high;
    }

    double method2(double[] data){
      double answer=data[0];
      for (int i=1; i < data.length; i++) {
        double alt=data[i];
        if (alt > answer) {
          answer=alt;
        }
      }
      return answer;
    }
}
