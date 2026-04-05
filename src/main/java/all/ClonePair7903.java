package all;

public class ClonePair7903 {

    int method1(int x,int y){
      if (x >= 0) {
        return x % y;
      }
     else {
        int tmp=-x % y;
        return (tmp == 0) ? tmp : (y - tmp);
      }
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
