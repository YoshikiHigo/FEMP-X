package unverified;

public class ClonePair13000 {

    int method1(long x){
      if (x >= Integer.MAX_VALUE) {
        return Integer.MAX_VALUE;
      }
     else   if (x <= Integer.MIN_VALUE) {
        return Integer.MIN_VALUE;
      }
      return (int)x;
    }

    int method2(long val){
      if (val >= Integer.MAX_VALUE)   return Integer.MAX_VALUE;
      if (val <= Integer.MIN_VALUE)   return Integer.MIN_VALUE;
      return (int)val;
    }
}
