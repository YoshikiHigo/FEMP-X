package all;

public class ClonePair4581 {

    double method1(double[] d){
      double high=d[0];
      for (int k=1; k < d.length; k++) {
        if (d[k] > high) {
          high=d[k];
        }
      }
      return high;
    }

    double method2(double[] array){
      int len=array.length;
      int best=0;
      double max=array[0];
      for (int i=1; i < len; i++) {
        if (array[i] > max) {
          best=i;
          max=array[i];
        }
      }
      return max;
    }
}
