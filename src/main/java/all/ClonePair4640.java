package all;

public class ClonePair4640 {

    double method1(double[] v){
      double max=v[0];
      for (int i=1; i < v.length; i++) {
        if (max < v[i]) {
          max=v[i];
        }
      }
      return (max);
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
