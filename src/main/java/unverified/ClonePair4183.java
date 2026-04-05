package unverified;

public class ClonePair4183 {

    float method1(float v1,float v2,float vH){
      if (vH < 0.0f) {
        vH+=1.0f;
      }
      if (vH > 1.0f) {
        vH-=1.0f;
      }
      if ((6.0f * vH) < 1.0f) {
        return (v1 + (v2 - v1) * 6.0f * vH);
      }
      if ((2.0f * vH) < 1.0f) {
        return (v2);
      }
      if ((3.0f * vH) < 2.0f) {
        return (v1 + (v2 - v1) * ((2.0f / 3.0f) - vH) * 6.0f);
      }
      return (v1);
    }

    float method2(float v1,float v2,float vH){
      if (vH < 0) {
        vH+=1;
      }
      if (vH > 1) {
        vH-=1;
      }
      if ((6 * vH) < 1) {
        return (v1 + (v2 - v1) * 6 * vH);
      }
      if ((2 * vH) < 1) {
        return v2;
      }
      if ((3 * vH) < 2) {
        return (v1 + (v2 - v1) * ((2 / 3f) - vH) * 6);
      }
      return (v1);
    }
}
