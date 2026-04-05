package all;

public class ClonePair6908 {

    int method1(int x,int y,int z){
      if (x > y)   if (x > z)   return x;
     else   return z;
     else   if (y > z)   return y;
     else   return z;
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
