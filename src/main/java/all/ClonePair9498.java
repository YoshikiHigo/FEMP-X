package all;

public class ClonePair9498 {

    boolean method1(int[] values){
      for (int i=0, len=values.length - 1; i < len; ) {
        if (values[i++] > values[i])     return false;
      }
      return true;
    }

    boolean method2(int[] array){
      for (int i=1; i < array.length; ++i) {
        if (array[i - 1] > array[i])     return false;
      }
      return true;
    }
}
