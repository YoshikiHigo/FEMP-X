package all;

public class ClonePair6702 {

    int method1(int a,int b,int c){
      int mi;
      mi=a;
      if (b < mi)   mi=b;
      if (c < mi)   mi=c;
      return mi;
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
