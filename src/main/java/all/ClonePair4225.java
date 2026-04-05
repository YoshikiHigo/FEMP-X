package all;

public class ClonePair4225 {

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

    float method2(float v1,float v2,float vH){
      if (vH < 0)   vH+=1;
      if (vH > 1)   vH-=1;
      if ((6 * vH) < 1)   return (v1 + (v2 - v1) * 6 * vH);
      if ((2 * vH) < 1)   return v2;
      if ((3 * vH) < 2)   return (v1 + (v2 - v1) * ((2 / 3f) - vH) * 6);
      return (v1);
    }
}
