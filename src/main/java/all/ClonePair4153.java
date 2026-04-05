package all;

public class ClonePair4153 {

    float method1(float v1,float v2,float hue){
      if (hue < 0.0f)   hue+=1.0f;
      if (hue > 1.0f)   hue-=1.0f;
      if ((6.0f * hue) < 1.0f)   return (v1 + (v2 - v1) * 6.0f * hue);
      if ((2.0f * hue) < 1.0f)   return v2;
      if ((3.0f * hue) < 2.0f)   return (v1 + (v2 - v1) * ((2.0f / 3.0f) - hue) * 6.0f);
      return v1;
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
