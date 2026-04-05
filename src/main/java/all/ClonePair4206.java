package all;

public class ClonePair4206 {

    float method1(float f1,float f2,float coordinate){
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

    float method2(float min,float max,float n){
      final float d=max - min;
      while (n < min) {
        n+=d;
      }
      while (n > max) {
        n-=d;
      }
      return n;
    }
}
