package unverified;

public class ClonePair5582 {

    int method1(int x,int n){
      int y=x % n;
      if (y < 0) {
        y+=n;
      }
      return y;
    }

    int method2(int x,int width){
      if (x >= 0 && x < width)   return x;
      x=x % width;
      if (x < 0)   x+=width;
      return x;
    }
}
