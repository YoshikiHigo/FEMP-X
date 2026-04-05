package all;

public class ClonePair9382 {

    int method1(int[] array){
      int min=array[0];
      for (int i=1; i < array.length; i++) {
        if (array[i] < min) {
          min=array[i];
        }
      }
      return min;
    }

    int method2(int[] numbers){
      int min=numbers[0];
      for (int i=1; i < numbers.length; ++i)   if (numbers[i] < min)   min=numbers[i];
      return min;
    }
}
