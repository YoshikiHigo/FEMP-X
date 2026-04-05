package unverified;

public class ClonePair6703 {

    int method1(int a,int b,int c){
      int mi;
      mi=a;
      if (b < mi)   mi=b;
      if (c < mi)   mi=c;
      return mi;
    }

    int method2(int a,int b,int c){
      if (a <= b && a <= c) {
        return a;
      }
      if (b <= a && b <= c) {
        return b;
      }
      return c;
    }
}
