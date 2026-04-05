package all;

public class ClonePair6765 {

    int method1(int a,int b,int c){
      int ma;
      ma=a;
      if (b > ma) {
        ma=b;
      }
      if (c > ma) {
        ma=c;
      }
      return ma;
    }

    int method2(int y0,int y1,int y2){
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
