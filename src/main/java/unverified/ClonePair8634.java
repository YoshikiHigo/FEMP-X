package unverified;

public class ClonePair8634 {

    short method1(int sample){
      if (sample < Short.MIN_VALUE) {
        return Short.MIN_VALUE;
      }
     else   if (sample > Short.MAX_VALUE) {
        return Short.MAX_VALUE;
      }
      return (short)sample;
    }

    short method2(int value){
      if (value > Short.MAX_VALUE)   return Short.MAX_VALUE;
      if (value < Short.MIN_VALUE)   return Short.MIN_VALUE;
      return (short)value;
    }
}
