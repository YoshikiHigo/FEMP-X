package all;

public class ClonePair4172 {

    float method1(float a,float b,float c){
      if (b > a) {
        if (c > b) {
          return b;
        }
        if (a > c) {
          return a;
        }
        return c;
      }
     else {
        if (c > a) {
          return a;
        }
        if (b > c) {
          return b;
        }
        return c;
      }
    }

    float method2(float f1,float f2,float coordinate){
      final float fromAdjustedValue;
      final float fromMin=Math.min(f1,f2);
      final float fromMax=Math.max(f1,f2);
      if (coordinate < fromMin) {
        fromAdjustedValue=fromMin;
      }
     else   if (coordinate > fromMax) {
        fromAdjustedValue=fromMax;
      }
     else {
        fromAdjustedValue=coordinate;
      }
      return fromAdjustedValue;
    }
}
