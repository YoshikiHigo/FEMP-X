package all;

public class ClonePair8635 {

    short method1(int i){
      int result=i;
      if (result > Short.MAX_VALUE) {
        return Short.MAX_VALUE;
      }
      if (result < Short.MIN_VALUE) {
        return Short.MIN_VALUE;
      }
      return (short)i;
    }

    short method2(int value){
      if (value > Short.MAX_VALUE)   return Short.MAX_VALUE;
      if (value < Short.MIN_VALUE)   return Short.MIN_VALUE;
      return (short)value;
    }
}
