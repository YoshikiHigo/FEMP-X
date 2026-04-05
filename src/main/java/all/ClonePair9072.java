package all;

public class ClonePair9072 {

    int method1(int... xs){
      int max=xs[0];
      for (int i=1; i < xs.length; ++i)   if (xs[i] > max)   max=xs[i];
      return max;
    }

    int method2(int... values){
      int value=values[0];
      int len=values.length;
      for (int i=0; i < len; i++) {
        if (values[i] >= value)     value=values[i];
      }
      return value;
    }
}
