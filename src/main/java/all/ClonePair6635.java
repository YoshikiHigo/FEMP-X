package all;

public class ClonePair6635 {

    int method1(int x,int width){
      if (x >= 0 && x < width)   return x;
      x=x % width;
      if (x < 0)   x+=width;
      return x;
    }

    int method2(int x,int y){
      x=x % y;
      if (x < 0) {
        x+=y;
      }
      return x;
    }
}
