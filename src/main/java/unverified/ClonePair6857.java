package unverified;

public class ClonePair6857 {

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

    int method2(int i,int j,int k){
      if (i < j) {
        return (i < k) ? i : k;
      }
     else {
        return (j < k) ? j : k;
      }
    }
}
