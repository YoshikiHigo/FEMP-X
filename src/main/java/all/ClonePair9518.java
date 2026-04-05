package all;

public class ClonePair9518 {

    int method1(int[] v){
      int min=v[0];
      for (int i=1; i < v.length; i++) {
        if (min > v[i]) {
          min=v[i];
        }
      }
      return (min);
    }

    int method2(int[] numbers){
      int min=numbers[0];
      for (int i=1; i < numbers.length; ++i)   if (numbers[i] < min)   min=numbers[i];
      return min;
    }
}
