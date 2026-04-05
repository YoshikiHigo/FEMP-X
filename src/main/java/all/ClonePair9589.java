package all;

public class ClonePair9589 {

    int method1(int[] numbers){
      int min=numbers[0];
      for (int i=1; i < numbers.length; ++i)   if (numbers[i] < min)   min=numbers[i];
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
