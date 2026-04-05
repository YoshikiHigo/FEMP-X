package unverified;

public class ClonePair13005 {

    int method1(long l){
      if (l <= Integer.MIN_VALUE) {
        return Integer.MIN_VALUE;
      }
     else   if (l >= Integer.MAX_VALUE) {
        return Integer.MAX_VALUE;
      }
     else {
        return (int)l;
      }
    }

    int method2(long value){
      if (value < Integer.MIN_VALUE)   return Integer.MIN_VALUE;
      if (value > Integer.MAX_VALUE)   return Integer.MAX_VALUE;
      return (int)value;
    }
}
