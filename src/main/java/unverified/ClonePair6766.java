package unverified;

public class ClonePair6766 {

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

    int method2(int i1,int i2,int i3){
      int max=i1;
      if (i2 > i1) {
        max=i2;
      }
      if (i3 > max) {
        max=i3;
      }
      return max;
    }
}
