package all;

public class ClonePair6767 {

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

    int method2(int x,int y,int z){
      if (x > y)   if (x > z)   return x;
     else   return z;
     else   if (y > z)   return y;
     else   return z;
    }
}
