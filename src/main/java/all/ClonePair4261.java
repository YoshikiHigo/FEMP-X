package all;

public class ClonePair4261 {

    float method1(float v,float min,float max){
      if (v < min) {
        v=min;
      }
     else   if (v > max) {
        v=max;
      }
      return v;
    }

    float method2(float val,float min,float max){
      if (val < min || Float.isNaN(val)) {
        return min;
      }
     else   if (val > max) {
        return max;
      }
     else {
        return val;
      }
    }
}
