package unverified;

public class ClonePair6852 {

    int method1(int y0,int y1,int y2){
      if ((y0 <= y1) && (y0 <= y2)) {
        return y0;
      }
     else   if (y1 <= y2) {
        return y1;
      }
     else {
        return y2;
      }
    }

    int method2(int x,int y,int z){
      if ((x < y) && (x < z)) {
        return x;
      }
      if (y < z) {
        return y;
      }
      return z;
    }
}
