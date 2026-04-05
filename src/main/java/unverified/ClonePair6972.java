package unverified;

public class ClonePair6972 {

    int method1(int i1,int i2,int i3){
      if ((i1 < i2) && (i1 < i3))   return i1;
      return i2 < i3 ? i2 : i3;
    }

    int method2(int a,int b,int c){
      if (a <= b && a <= c)   return a;
      if (b <= a && b <= c)   return b;
      return c;
    }
}
