package all;

public class ClonePair12968 {

    int method1(long l){
      int m;
      if (l < (m=Integer.MAX_VALUE) && l > (m=Integer.MIN_VALUE))   return (int)l;
      return m;
    }

    int method2(long value){
      if (value < Integer.MIN_VALUE)   return Integer.MIN_VALUE;
      if (value > Integer.MAX_VALUE)   return Integer.MAX_VALUE;
      return (int)value;
    }
}
