package all;

public class ClonePair4167 {

    float method1(float val,float min,float max){
      if (Float.isInfinite(val) || Float.isNaN(val))   return 0f;
      float range=max - min;
      while (val > max)   val-=range;
      while (val < min)   val+=range;
      return val;
    }

    float method2(float value,float min,float max){
      if (value > max) {
        return max;
      }
     else   if (value < min) {
        return min;
      }
      return value;
    }
}
