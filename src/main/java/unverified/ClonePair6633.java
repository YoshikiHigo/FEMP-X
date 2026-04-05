package unverified;

public class ClonePair6633 {

    int method1(int x,int width){
      if (x >= 0 && x < width)   return x;
      x=x % width;
      if (x < 0)   x+=width;
      return x;
    }

    int method2(int x,int y){
      if (x >= 0) {
        return x % y;
      }
     else {
        int tmp=-x % y;
        return (tmp == 0) ? tmp : (y - tmp);
      }
    }
}
