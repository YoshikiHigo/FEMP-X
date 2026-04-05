package unverified;

public class ClonePair4169 {

    float method1(float val,float min,float max){
      if (Float.isInfinite(val) || Float.isNaN(val))   return 0f;
      float range=max - min;
      while (val > max)   val-=range;
      while (val < min)   val+=range;
      return val;
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
