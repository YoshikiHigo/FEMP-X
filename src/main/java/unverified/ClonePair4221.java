package unverified;

public class ClonePair4221 {

    float method1(float val,float min,float max){
      if (Float.isInfinite(val) || Float.isNaN(val))   return max;
      float range=max - min;
      while (val > max)   val-=range;
      while (val <= min)   val+=range;
      return val;
    }

    float method2(float y0,float y1,float y2){
      if ((y0 >= y1) && (y0 >= y2)) {
        return y0;
      }
     else   if (y1 >= y2) {
        return y1;
      }
     else {
        return y2;
      }
    }
}
