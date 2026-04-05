package unverified;

public class ClonePair6854 {

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

    int method2(int i1,int i2,int i3){
      if ((i1 < i2) && (i1 < i3))   return i1;
      return i2 < i3 ? i2 : i3;
    }
}
