package unverified;

public class ClonePair9500 {

    int method1(int[] _d){
      int max=_d[0];
      for (int i=1; i < _d.length; i++) {
        if (_d[i] > max)     max=_d[i];
      }
      return max;
    }

    int method2(int[] numbers){
      int max=numbers[0];
      for (int i=1; i < numbers.length; ++i)   if (numbers[i] > max)   max=numbers[i];
      return max;
    }
}
