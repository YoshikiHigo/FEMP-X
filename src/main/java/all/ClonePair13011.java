package all;

public class ClonePair13011 {

    int method1(long value){
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

    int method2(long val){
      if (val >= Integer.MAX_VALUE)   return Integer.MAX_VALUE;
      if (val <= Integer.MIN_VALUE)   return Integer.MIN_VALUE;
      return (int)val;
    }
}
