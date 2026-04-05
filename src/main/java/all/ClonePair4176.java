package all;

public class ClonePair4176 {

    float method1(float n1,float n2,float h){
      if (h > 360) {
        h-=360;
      }
     else   if (h < 0) {
        h+=360;
      }
      if (h < 60) {
        return n1 + (n2 - n1) * h / 60.0f;
      }
     else   if (h < 180) {
        return n2;
      }
     else   if (h < 240) {
        return n1 + (n2 - n1) * (240.0f - h) / 60.0f;
      }
      return n1;
    }

    float method2(float n1,float n2,float hue){
      if (hue > 360.0f)   hue-=360.0f;
     else   if (hue < 0.0f)   hue+=360.0f;
      if (hue < 60.0f)   return n1 + (n2 - n1) * hue / 60.0f;
     else   if (hue < 180.0f)   return n2;
     else   if (hue < 240.0f)   return n1 + (n2 - n1) * (240.0f - hue) / 60.0f;
     else   return n1;
    }
}
