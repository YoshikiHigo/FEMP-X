package all;

public class ClonePair13006 {

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
