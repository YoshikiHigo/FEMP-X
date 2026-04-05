package all;

public class ClonePair4245 {

    float method1(float y0,float y1,float y2){
      if ((y0 >= y1) && (y0 >= y2)) {
        return y0;
      }
     else   if (y1 >= y2) {
        return y1;
      }
     else {
        return y2;
      }
    }

    float method2(float r,float g,float b){
      float max=r;
      if (g > max)   max=g;
      if (b > max)   max=b;
      return max;
    }
}
