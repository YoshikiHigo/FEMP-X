package unverified;

public class ClonePair4155 {

    float method1(float v1,float v2,float hue){
      if (hue < 0.0f)   hue+=1.0f;
      if (hue > 1.0f)   hue-=1.0f;
      if ((6.0f * hue) < 1.0f)   return (v1 + (v2 - v1) * 6.0f * hue);
      if ((2.0f * hue) < 1.0f)   return v2;
      if ((3.0f * hue) < 2.0f)   return (v1 + (v2 - v1) * ((2.0f / 3.0f) - hue) * 6.0f);
      return v1;
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
