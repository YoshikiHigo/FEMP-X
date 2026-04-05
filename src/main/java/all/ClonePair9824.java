package all;

public class ClonePair9824 {

    int method1(int[] v){
      int max=v[0];
      for (int i=1; i < v.length; i++) {
        if (max < v[i]) {
          max=v[i];
        }
      }
      return (max);
    }

    int method2(int[] values){
      int max=values[0];
      for (  int value : values) {
        if (value > max) {
          max=value;
        }
      }
      return max;
    }
}
