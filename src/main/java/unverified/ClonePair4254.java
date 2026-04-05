package unverified;

public class ClonePair4254 {

    float method1(float t1,float t2,float hue){
      if (hue < 0)   hue+=1;
     else   if (hue > 1)   hue-=1;
      if (6f * hue < 1)   return t1 + (t2 - t1) * 6f * hue;
      if (2f * hue < 1)   return t2;
      if (3f * hue < 2)   return t1 + (t2 - t1) * (2f / 3f - hue) * 6f;
      return t1;
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
