package all;

public class ClonePair13010 {

    int method1(long value){
      if (value < Integer.MIN_VALUE)   return Integer.MIN_VALUE;
      if (value > Integer.MAX_VALUE)   return Integer.MAX_VALUE;
      return (int)value;
    }

    int method2(long val){
      if (val >= Integer.MAX_VALUE)   return Integer.MAX_VALUE;
      if (val <= Integer.MIN_VALUE)   return Integer.MIN_VALUE;
      return (int)val;
    }
}
