package unverified;

public class ClonePair5585 {

    int method1(int x,int n){
      int y=x % n;
      if (y < 0) {
        y+=n;
      }
      return y;
    }

    int method2(int D,int d){
      int R=0;
      int C=D / d;
      if (D < 0)   R=D + (1 - C) * d;
     else   R=D - C * d;
      return R;
    }
}
