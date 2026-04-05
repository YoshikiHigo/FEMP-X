package all;

public class ClonePair7733 {

    int method1(int p,int q){
      int shift;
      if (p == 0 || q == 0)   return p | q;
      for (shift=0; ((p | q) & 1) == 0; ++shift) {
        p>>>=1;
        q>>>=1;
      }
      while ((p & 1) == 0)   p>>>=1;
      do {
        while ((q & 1) == 0)     q>>>=1;
        if (p < q)     q-=p;
     else {
          final int diff=p - q;
          p=q;
          q=diff;
        }
        q>>>=1;
      }
     while (q != 0);
      return p << shift;
    }

    int method2(int m,int n){
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
}
