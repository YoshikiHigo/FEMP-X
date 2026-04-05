package all;

public class ClonePair4238 {

    float method1(float min,float max,float val){
      if (val >= min && val <= max)   return val;
      if (val < min)   return min;
      if (val > max)   return max;
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
