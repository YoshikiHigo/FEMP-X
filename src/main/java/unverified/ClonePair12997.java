package unverified;

public class ClonePair12997 {

    int method1(long x){
      if (x >= Integer.MAX_VALUE) {
        return Integer.MAX_VALUE;
      }
     else   if (x <= Integer.MIN_VALUE) {
        return Integer.MIN_VALUE;
      }
      return (int)x;
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
