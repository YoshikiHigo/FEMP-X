package unverified;

public class ClonePair13002 {

    int method1(long value){
      if (value > Integer.MAX_VALUE) {
        return Integer.MAX_VALUE;
      }
      if (value < Integer.MIN_VALUE) {
        return Integer.MIN_VALUE;
      }
      return (int)value;
    }

    int method2(long value){
      if (value < Integer.MIN_VALUE)   return Integer.MIN_VALUE;
      if (value > Integer.MAX_VALUE)   return Integer.MAX_VALUE;
      return (int)value;
    }
}
