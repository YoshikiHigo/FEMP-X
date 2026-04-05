package all;

public class ClonePair9592 {

    int method1(int[] numbers){
      int min=numbers[0];
      for (int i=1; i < numbers.length; ++i)   if (numbers[i] < min)   min=numbers[i];
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
