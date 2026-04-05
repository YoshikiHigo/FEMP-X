package all;

public class ClonePair12993 {

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

    int method2(long value){
      if (value < Integer.MIN_VALUE)   return Integer.MIN_VALUE;
      if (value > Integer.MAX_VALUE)   return Integer.MAX_VALUE;
      return (int)value;
    }
}
