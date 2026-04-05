package all;

public class ClonePair6714 {

    int method1(int a,int b,int c){
      int mi;
      mi=a;
      if (b < mi)   mi=b;
      if (c < mi)   mi=c;
      return mi;
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
