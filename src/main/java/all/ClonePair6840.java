package all;

public class ClonePair6840 {

    int method1(int a,int b,int c){
      if (a <= b && a <= c) {
        return a;
      }
      if (b <= a && b <= c) {
        return b;
      }
      return c;
    }

    int method2(int y0,int y1,int y2){
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
}
