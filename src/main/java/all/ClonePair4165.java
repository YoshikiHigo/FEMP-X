package all;

public class ClonePair4165 {

    float method1(float val,float min,float max){
      if (Float.isInfinite(val) || Float.isNaN(val))   return 0f;
      float range=max - min;
      while (val > max)   val-=range;
      while (val < min)   val+=range;
      return val;
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
