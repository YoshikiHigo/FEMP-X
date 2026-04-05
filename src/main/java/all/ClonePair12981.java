package all;

public class ClonePair12981 {

    int method1(long x){
      if (x > Integer.MAX_VALUE)   return Integer.MAX_VALUE;
      if (x < Integer.MIN_VALUE)   return Integer.MIN_VALUE;
      return (int)x;
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
