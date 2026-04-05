package all;

public class ClonePair6843 {

    int method1(int a,int b,int c){
      if (a <= b && a <= c) {
        return a;
      }
      if (b <= a && b <= c) {
        return b;
      }
      return c;
    }

    int method2(int x,int y,int z){
      if ((x < y) && (x < z)) {
        return x;
      }
      if (y < z) {
        return y;
      }
      return z;
    }
}
