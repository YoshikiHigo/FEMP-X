package all;

public class ClonePair12986 {

    int method1(long x){
      if (x > Integer.MAX_VALUE)   return Integer.MAX_VALUE;
      if (x < Integer.MIN_VALUE)   return Integer.MIN_VALUE;
      return (int)x;
    }

    int method2(long value){
      if (value < Integer.MIN_VALUE)   return Integer.MIN_VALUE;
      if (value > Integer.MAX_VALUE)   return Integer.MAX_VALUE;
      return (int)value;
    }
}
