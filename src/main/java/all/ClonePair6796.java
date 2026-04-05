package all;

public class ClonePair6796 {

    int method1(int y0,int y1,int y2){
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

    int method2(int x,int y,int z){
      if (x > y)   if (x > z)   return x;
     else   return z;
     else   if (y > z)   return y;
     else   return z;
    }
}
