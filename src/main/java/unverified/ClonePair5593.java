package unverified;

public class ClonePair5593 {

    int method1(int x,int n){
      int y=x % n;
      if (y < 0) {
        y+=n;
      }
      return y;
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
