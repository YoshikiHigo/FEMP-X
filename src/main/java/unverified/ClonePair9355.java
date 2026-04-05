package unverified;

public class ClonePair9355 {

    int method1(int[] sn){
      int result=sn[0];
      for (int i=0; i < sn.length; i++) {
        if (result < sn[i])     result=sn[i];
      }
      return result;
    }

    int method2(int[] array){
      int max=array[0];
      for (int i=1; i < array.length; i++) {
        if (array[i] > max) {
          max=array[i];
        }
      }
      return max;
    }
}
