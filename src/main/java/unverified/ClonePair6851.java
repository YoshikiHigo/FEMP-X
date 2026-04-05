package unverified;

public class ClonePair6851 {

    int method1(int a,int b,int c){
      if (a <= b && a <= c) {
        return a;
      }
      if (b <= a && b <= c) {
        return b;
      }
      return c;
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
