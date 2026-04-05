package all;

public class ClonePair4831 {

    double method1(double[] d){
      double low=d[0];
      for (int k=1; k < d.length; k++) {
        if (d[k] < low) {
          low=d[k];
        }
      }
      return low;
    }

    double method2(double[] array){
      double min=array[0];
      for (int i=1; i < array.length; i++) {
        if (array[i] < min)     min=array[i];
      }
      return min;
    }
}
