package all;

public class ClonePair13001 {

    int method1(long value){
      if (value > Integer.MAX_VALUE) {
        return Integer.MAX_VALUE;
      }
      if (value < Integer.MIN_VALUE) {
        return Integer.MIN_VALUE;
      }
      return (int)value;
    }

    int method2(long l){
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
}
