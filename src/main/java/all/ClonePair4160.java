package all;

public class ClonePair4160 {

    float method1(float a,float b,float c){
      if (a > b && a > c)   return a;
      if (b > a && b > c)   return b;
      return c;
    }

    float method2(float y0,float y1,float y2){
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
}
