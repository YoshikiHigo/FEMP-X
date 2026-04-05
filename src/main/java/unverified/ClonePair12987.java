package unverified;

public class ClonePair12987 {

    int method1(long x){
      if (x > Integer.MAX_VALUE)   return Integer.MAX_VALUE;
      if (x < Integer.MIN_VALUE)   return Integer.MIN_VALUE;
      return (int)x;
    }

    int method2(long value){
      if (value < (long)Integer.MIN_VALUE) {
        return Integer.MIN_VALUE;
      }
     else   if (value > (long)Integer.MAX_VALUE) {
        return Integer.MAX_VALUE;
      }
     else {
        return (int)value;
      }
    }
}
