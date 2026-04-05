package unverified;

public class ClonePair12964 {

    int method1(long l){
      int m;
      if (l < (m=Integer.MAX_VALUE) && l > (m=Integer.MIN_VALUE))   return (int)l;
      return m;
    }

    int method2(long input){
      int result;
      if (input > Integer.MAX_VALUE) {
        result=Integer.MAX_VALUE;
      }
     else   if (input < Integer.MIN_VALUE) {
        result=Integer.MIN_VALUE;
      }
     else {
        result=(int)input;
      }
      return result;
    }
}
