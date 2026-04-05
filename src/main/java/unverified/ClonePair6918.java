package unverified;

public class ClonePair6918 {

    int method1(int a,int b,int c){
      int minimum=a;
      if (b < minimum) {
        minimum=b;
      }
      if (c < minimum) {
        minimum=c;
      }
      return minimum;
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
