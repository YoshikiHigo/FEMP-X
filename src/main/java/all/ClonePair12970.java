package all;

public class ClonePair12970 {

    int method1(long l){
      int m;
      if (l < (m=Integer.MAX_VALUE) && l > (m=Integer.MIN_VALUE))   return (int)l;
      return m;
    }

    int method2(long val){
      if (val >= Integer.MAX_VALUE)   return Integer.MAX_VALUE;
      if (val <= Integer.MIN_VALUE)   return Integer.MIN_VALUE;
      return (int)val;
    }
}
