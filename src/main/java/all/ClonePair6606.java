package all;

public class ClonePair6606 {

    byte method1(long value){
      if (value > Byte.MAX_VALUE) {
        return Byte.MAX_VALUE;
      }
      if (value < Byte.MIN_VALUE) {
        return Byte.MIN_VALUE;
      }
      return (byte)value;
    }

    byte method2(long l){
      double result=l;
      if (result > Byte.MAX_VALUE) {
        return Byte.MAX_VALUE;
      }
      if (result < Byte.MIN_VALUE) {
        return Byte.MIN_VALUE;
      }
      return (byte)result;
    }
}
