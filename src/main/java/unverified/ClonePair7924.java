package unverified;

public class ClonePair7924 {

    int method1(int x,int y){
      x=x % y;
      if (x < 0) {
        x+=y;
      }
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
