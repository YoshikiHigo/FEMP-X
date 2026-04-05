package unverified;

public class ClonePair9442 {

    int method1(int[] vet){
      int max=vet[0];
      for (int i=1; i < vet.length; i++) {
        if (vet[i] > max) {
          max=vet[i];
        }
      }
      return (max);
    }

    int method2(int[] numbers){
      int max=numbers[0];
      for (int i=1; i < numbers.length; ++i)   if (numbers[i] > max)   max=numbers[i];
      return max;
    }
}
