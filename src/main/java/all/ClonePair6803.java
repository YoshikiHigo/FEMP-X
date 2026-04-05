package all;

public class ClonePair6803 {

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

    int method2(int a,int b,int c){
      int max=0;
      if ((a >= b) && (a >= c)) {
        max=a;
      }
     else   if ((b >= a) && (b >= c)) {
        max=b;
      }
     else {
        max=c;
      }
      return max;
    }
}
