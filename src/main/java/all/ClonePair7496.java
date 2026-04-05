package all;

public class ClonePair7496 {

    int method1(int D,int d){
      int R=0;
      int C=D / d;
      if (D < 0)   R=D + (1 - C) * d;
     else   R=D - C * d;
      return R;
    }

    int method2(int x,int y){
      x=x % y;
      if (x < 0) {
        x+=y;
      }
      return x;
    }
}
