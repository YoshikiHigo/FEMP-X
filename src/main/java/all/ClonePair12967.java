package all;

public class ClonePair12967 {

    int method1(long l){
      int m;
      if (l < (m=Integer.MAX_VALUE) && l > (m=Integer.MIN_VALUE))   return (int)l;
      return m;
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
