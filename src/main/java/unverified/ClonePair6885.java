package unverified;

public class ClonePair6885 {

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
      if (a <= b && a <= c)   return a;
     else   if (b <= c && b <= a)   return b;
     else   return c;
    }
}
