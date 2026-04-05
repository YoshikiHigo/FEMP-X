package all;

public class ClonePair6896 {

    int method1(int x,int y,int z){
      if ((x < y) && (x < z)) {
        return x;
      }
      if (y < z) {
        return y;
      }
      return z;
    }

    int method2(int a1,int a2,int a3){
      if (a1 < a2) {
        if (a1 < a3) {
          return a1;
        }
     else {
          return a3;
        }
      }
     else {
        if (a2 < a3) {
          return a2;
        }
     else {
          return a3;
        }
      }
    }
}
