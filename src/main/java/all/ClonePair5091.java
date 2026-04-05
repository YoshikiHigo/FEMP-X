package all;

public class ClonePair5091 {

    boolean method1(int c1,int r1,int c2,int r2){
      if (c1 == c2) {
        return (Math.abs(r1 - r2) < 2);
      }
      if (r1 == r2) {
        return (Math.abs(c1 - c2) < 2);
      }
      return (Math.abs(r1 - r2) + Math.abs(c2 - c1) <= 2);
    }

    boolean method2(int x0,int y0,int x1,int y1){
      if (x0 == x1 && y0 == y1) {
        return true;
      }
      if (x0 == x1) {
        if (Math.abs(y0 - y1) <= 1) {
          return true;
        }
      }
      if (Math.abs(x0 - x1) == 1) {
        if (y0 == y1) {
          return true;
        }
        if (x0 % 2 == 0) {
          if (y0 == y1 + 1) {
            return true;
          }
        }
     else {
          if (y0 == y1 - 1) {
            return true;
          }
        }
      }
      return false;
    }
}
