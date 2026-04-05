package all;

public class ClonePair12969 {

    int method1(long l){
      int m;
      if (l < (m=Integer.MAX_VALUE) && l > (m=Integer.MIN_VALUE))   return (int)l;
      return m;
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
