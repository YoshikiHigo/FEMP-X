package unverified;

public class ClonePair12992 {

    int method1(long input){
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
