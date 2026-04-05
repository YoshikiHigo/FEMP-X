package unverified;

public class ClonePair9371 {

    int method1(int[] array){
      int max=array[0];
      for (int i=1; i < array.length; i++) {
        if (array[i] > max) {
          max=array[i];
        }
      }
      return max;
    }

    int method2(int[] vet){
      int max=vet[0];
      for (int i=1; i < vet.length; i++) {
        if (vet[i] > max) {
          max=vet[i];
        }
      }
      return (max);
    }
}
