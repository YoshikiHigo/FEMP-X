package unverified;

public class ClonePair9381 {

    int method1(int[] array){
      int min=array[0];
      for (int i=1; i < array.length; i++) {
        if (array[i] < min) {
          min=array[i];
        }
      }
      return min;
    }

    int method2(int[] v){
      int min=v[0];
      for (int i=1; i < v.length; i++) {
        if (min > v[i]) {
          min=v[i];
        }
      }
      return (min);
    }
}
