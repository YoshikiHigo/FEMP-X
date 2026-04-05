package unverified;

public class ClonePair12996 {

    int method1(long x){
      if (x >= Integer.MAX_VALUE) {
        return Integer.MAX_VALUE;
      }
     else   if (x <= Integer.MIN_VALUE) {
        return Integer.MIN_VALUE;
      }
      return (int)x;
    }

    int method2(long value){
      if (value > Integer.MAX_VALUE) {
        return Integer.MAX_VALUE;
      }
      if (value < Integer.MIN_VALUE) {
        return Integer.MIN_VALUE;
      }
      return (int)value;
    }
}
