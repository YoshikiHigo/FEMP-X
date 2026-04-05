package unverified;

public class ClonePair9535 {

    int method1(int[] numbers){
      int max=numbers[0];
      for (int i=1; i < numbers.length; ++i)   if (numbers[i] > max)   max=numbers[i];
      return max;
    }

    int method2(int[] v){
      int max=v[0];
      for (int i=1; i < v.length; i++) {
        if (max < v[i]) {
          max=v[i];
        }
      }
      return (max);
    }
}
