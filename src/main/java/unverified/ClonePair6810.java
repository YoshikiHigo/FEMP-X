package unverified;

public class ClonePair6810 {

    int method1(int i1,int i2,int i3){
      int max=i1;
      if (i2 > i1) {
        max=i2;
      }
      if (i3 > max) {
        max=i3;
      }
      return max;
    }

    int method2(int a,int b,int c){
      if (a >= b && a >= c)   return a;
     else   if (b >= c && b >= a)   return b;
     else   return c;
    }
}
