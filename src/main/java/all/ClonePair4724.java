package all;

public class ClonePair4724 {

    double method1(double[] v){
      double min=v[0];
      for (int i=1; i < v.length; i++) {
        if (min > v[i]) {
          min=v[i];
        }
      }
      return (min);
    }

    double method2(double[] d){
      double low=d[0];
      for (int k=1; k < d.length; k++) {
        if (d[k] < low) {
          low=d[k];
        }
      }
      return low;
    }
}
