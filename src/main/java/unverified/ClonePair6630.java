package unverified;

public class ClonePair6630 {

    int method1(int x,int width){
      if (x >= 0 && x < width)   return x;
      x=x % width;
      if (x < 0)   x+=width;
      return x;
    }

    int method2(int D,int d){
      int R=0;
      int C=D / d;
      if (D < 0)   R=D + (1 - C) * d;
     else   R=D - C * d;
      return R;
    }
}
