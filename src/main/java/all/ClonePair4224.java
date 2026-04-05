package all;

public class ClonePair4224 {

    float method1(float m1,float m2,float h){
      if (h < 0) {
        h++;
      }
      if (h > 1) {
        h--;
      }
      if ((h * 6) < 1) {
        return m1 + (m2 - m1) * h * 6;
      }
      if ((h * 2) < 1) {
        return m2;
      }
      if ((h * 3) < 2) {
        return m1 + (m2 - m1) * ((2f / 3) - h) * 6;
      }
      return m1;
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
