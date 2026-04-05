package unverified;

public class ClonePair7603 {

    int method1(int a,int b){
      if (a == 0)   return b;
      int k=0, t=0;
      while ((a & 1) == 0 && (b & 1) == 0) {
        a/=2;
        b/=2;
        k++;
      }
      if ((a & 1) != 0)   t=-b;
     else   t=a;
      while (t != 0) {
        while ((t & 1) == 0)     t/=2;
        if (t > 0)     a=t;
     else     b=-t;
        t=a - b;
      }
      return a * (1 << k);
    }

    int method2(int p,int q){
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
}
