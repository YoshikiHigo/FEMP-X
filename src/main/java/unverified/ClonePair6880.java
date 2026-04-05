package unverified;

public class ClonePair6880 {

    int method1(int x,int y,int z){
      if ((x < y) && (x < z)) {
        return x;
      }
      if (y < z) {
        return y;
      }
      return z;
    }

    int method2(int a,int b,int c){
      int minimum=a;
      if (b < minimum) {
        minimum=b;
      }
      if (c < minimum) {
        minimum=c;
      }
      return minimum;
    }
}
