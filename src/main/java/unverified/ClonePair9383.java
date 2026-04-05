package unverified;

public class ClonePair9383 {

    int method1(int[] array){
      int min=array[0];
      for (int i=1; i < array.length; i++) {
        if (array[i] < min) {
          min=array[i];
        }
      }
      return min;
    }

    int method2(int[] polje){
      int min=polje[0];
      for (int i=1; i < polje.length; i++) {
        if (polje[i] < min)     min=polje[i];
      }
      return min;
    }
}
