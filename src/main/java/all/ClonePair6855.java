package all;

public class ClonePair6855 {

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

    int method2(int a,int b,int c){
      if (a <= b && a <= c)   return a;
     else   if (b <= c && b <= a)   return b;
     else   return c;
    }
}
