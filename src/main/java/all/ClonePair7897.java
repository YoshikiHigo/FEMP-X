package all;

public class ClonePair7897 {

    int method1(int m,int n){
      if (n < 0) {
        n=-n;
      }
      if (m < n) {
        int t=m;
        m=n;
        n=t;
      }
      while (n != 0) {
        int r=m % n;
        m=n;
        n=r;
      }
      return m;
    }

    int method2(int m,int n){
      if (n < 0)   n=-n;
      if (m < n) {
        int tmp=m;
        m=n;
        n=tmp;
      }
      for (; ; )   if (n == 0)   return m;
     else   if (n == 1)   return n;
     else {
        int tmp=n;
        n=m % n;
        m=tmp;
      }
    }
}
