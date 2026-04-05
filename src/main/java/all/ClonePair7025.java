package all;

public class ClonePair7025 {

    float method1(float a1,float a2,float b1,float b2,float x){
      if (x < a1 || x >= b2)   return 0;
      if (x >= a2) {
        if (x < b1)     return 1.0f;
        x=(x - b1) / (b2 - b1);
        return 1.0f - (x * x * (3.0f - 2.0f * x));
      }
      x=(x - a1) / (a2 - a1);
      return x * x * (3.0f - 2.0f * x);
    }

    float method2(float a1,float a2,float b1,float b2,float x){
      if (x < a1 || x >= b2) {
        return 0;
      }
      if (x >= a2) {
        if (x < b1) {
          return 1.0f;
        }
        x=(x - b1) / (b2 - b1);
        return 1.0f - (x * x * (3.0f - 2.0f * x));
      }
      x=(x - a1) / (a2 - a1);
      return x * x * (3.0f - 2.0f * x);
    }
}
