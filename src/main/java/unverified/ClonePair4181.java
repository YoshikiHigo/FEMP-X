package unverified;

public class ClonePair4181 {

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

    float method2(float t1,float t2,float hue){
      if (hue < 0)   hue+=1;
     else   if (hue > 1)   hue-=1;
      if (6f * hue < 1)   return t1 + (t2 - t1) * 6f * hue;
      if (2f * hue < 1)   return t2;
      if (3f * hue < 2)   return t1 + (t2 - t1) * (2f / 3f - hue) * 6f;
      return t1;
    }
}
