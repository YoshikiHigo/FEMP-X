package unverified;

public class ClonePair6768 {

    int method1(int a,int b,int c){
      int ma;
      ma=a;
      if (b > ma) {
        ma=b;
      }
      if (c > ma) {
        ma=c;
      }
      return ma;
    }

    int method2(int a,int b,int c){
      if (b > a) {
        a=b;
      }
      if (c > a) {
        a=c;
      }
      return a;
    }
}
