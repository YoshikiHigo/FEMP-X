package unverified;

public class ClonePair4197 {

    float method1(float value,float min,float max){
      if (value < min) {
        return min;
      }
     else   if (value > max) {
        return max;
      }
      return value;
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
