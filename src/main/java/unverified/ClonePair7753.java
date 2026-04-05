package unverified;

public class ClonePair7753 {

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

    int method2(int a,int b){
      if (b == 0)   return a;
      if (a == 0)   return b;
      int aZeros=Integer.numberOfTrailingZeros(a);
      int bZeros=Integer.numberOfTrailingZeros(b);
      a>>>=aZeros;
      b>>>=bZeros;
      int t=(aZeros < bZeros ? aZeros : bZeros);
      while (a != b) {
        if ((a + 0x80000000) > (b + 0x80000000)) {
          a-=b;
          a>>>=Integer.numberOfTrailingZeros(a);
        }
     else {
          b-=a;
          b>>>=Integer.numberOfTrailingZeros(b);
        }
      }
      return a << t;
    }
}
