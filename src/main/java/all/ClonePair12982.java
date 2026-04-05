package all;

public class ClonePair12982 {

    int method1(long x){
      if (x > Integer.MAX_VALUE)   return Integer.MAX_VALUE;
      if (x < Integer.MIN_VALUE)   return Integer.MIN_VALUE;
      return (int)x;
    }

    int method2(long x){
      if (x >= Integer.MAX_VALUE) {
        return Integer.MAX_VALUE;
      }
     else   if (x <= Integer.MIN_VALUE) {
        return Integer.MIN_VALUE;
      }
      return (int)x;
    }
}
