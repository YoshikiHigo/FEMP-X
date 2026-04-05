package all;

public class ClonePair9384 {

    int method1(int[] array){
      int min=array[0];
      for (int i=1; i < array.length; i++) {
        if (array[i] < min) {
          min=array[i];
        }
      }
      return min;
    }

    int method2(int[] a){
      int min=a[0];
      for (int i=0; i < a.length; i++) {
        if (min > a[i]) {
          min=a[i];
        }
      }
      return min;
    }
}
