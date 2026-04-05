package unverified;

public class ClonePair9374 {

    int method1(int[] array){
      int max=array[0];
      for (int i=1; i < array.length; i++) {
        if (array[i] > max) {
          max=array[i];
        }
      }
      return max;
    }

    int method2(int[] numbers){
      int max=numbers[0];
      for (int i=1; i < numbers.length; ++i)   if (numbers[i] > max)   max=numbers[i];
      return max;
    }
}
