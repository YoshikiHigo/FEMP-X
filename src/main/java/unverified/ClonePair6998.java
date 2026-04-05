package unverified;

public class ClonePair6998 {

    int method1(int a,int b,int c){
      if ((a <= b) && (a <= c)) {
        return a;
      }
      if ((b <= a) && (b <= c)) {
        return b;
      }
      return c;
    }

    int method2(int a,int b,int c){
      if (a <= b && a <= c)   return a;
      if (b <= a && b <= c)   return b;
      return c;
    }
}
