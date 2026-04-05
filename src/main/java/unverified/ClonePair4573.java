package unverified;

public class ClonePair4573 {

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
      double max=data[0];
      for (int i=1; i < data.length; ++i)   if (data[i] > max)   max=data[i];
      return max;
    }
}
