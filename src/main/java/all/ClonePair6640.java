package all;

public class ClonePair6640 {

    int method1(int x,int width){
      if (x >= 0 && x < width)   return x;
      x=x % width;
      if (x < 0)   x+=width;
      return x;
    }

    int method2(int dd,int box){
      if (dd < 0) {
        if (dd % box != 0) {
          return box + dd % box;
        }
     else {
          return 0;
        }
      }
     else   if (dd >= box) {
        return dd % box;
      }
     else {
        return dd;
      }
    }
}
