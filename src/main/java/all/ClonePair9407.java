package all;

public class ClonePair9407 {

    int method1(int[] t){
      int m=t[0];
      for (int i=1; i < t.length; i++)   if (t[i] < m)   m=t[i];
      return m;
    }

    int method2(int[] numbers){
      int min=numbers[0];
      for (int i=1; i < numbers.length; ++i)   if (numbers[i] < min)   min=numbers[i];
      return min;
    }
}
