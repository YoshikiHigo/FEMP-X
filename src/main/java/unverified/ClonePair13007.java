package unverified;

public class ClonePair13007 {

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

    int method2(long val){
      if (val >= Integer.MAX_VALUE)   return Integer.MAX_VALUE;
      if (val <= Integer.MIN_VALUE)   return Integer.MIN_VALUE;
      return (int)val;
    }
}
