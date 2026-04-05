package all;

public class ClonePair3733 {

    int method1(double[] scores,int... t){
      final int a=t[0], b=t[1], c=t[2], d=t[3], e=t[4], f=t[5];
      int b_min=0, b_max=0;
      @SuppressWarnings("unused") int ai, bi, ci, di, ei, fi;
      final int c1=a + d, c2=b + e, c3=c + f;
      final int n1=a + b + c, n2=d + e + f, n=n1 + n2;
      final int b0=c2 + n1 + c1 - n;
      final int a_min=Math.max(0,c1 - n2), a_max=Math.min(c1,n1);
      final long N=n + n;
      final long N_AS=(c1 + c1 + c2) * (n1 + n1);
      long k=0;
      int nbTables=0;
      for (ai=a_min; ai <= a_max; ai++) {
        b_min=Math.max(0,b0 - ai);
        b_max=Math.min(n1 - ai,c2);
        k=N * (ai + ai + b_min) - N_AS;
        for (bi=b_min; bi <= b_max; bi++) {
          scores[nbTables++]=(k < 0) ? -k : k;
          k+=N;
        }
      }
      return nbTables;
    }

    int method2(double[] scores,int... t){
      final int a=t[0], b=t[1], c=t[2], d=t[3], e=t[4], f=t[5];
      int b_min=0, b_max=0;
      @SuppressWarnings("unused") int ai, bi, ci, di, ei, fi;
      final int c1=a + d, c2=b + e, c3=c + f;
      final int n1=a + b + c, n2=d + e + f, n=n1 + n2;
      final int b0=c2 + n1 + c1 - n;
      final int a_min=Math.max(0,c1 - n2), a_max=Math.min(c1,n1);
      int e1=n1 * c1, e2=n1 * c2, e3=n1 * c3;
      int k1=c2 * c3, k2=c1 * c3, k3=c1 * c2;
      if (c1 * c2 * c3 == 0) {
        if (c1 == 0) {
          k1=0;
          k2=c3;
          k3=c2;
        }
     else     if (c2 == 0) {
          k1=c3;
          k2=0;
          k3=c1;
        }
     else {
          k1=c2;
          k2=c1;
          k3=0;
        }
      }
      int nbTables=0;
      for (ai=a_min; ai <= a_max; ai++) {
        b_min=Math.max(0,b0 - ai);
        b_max=Math.min(n1 - ai,c2);
        for (bi=b_min; bi <= b_max; bi++) {
          ci=n1 - ai - bi;
          long tt=(n * ai - e1);
          tt*=tt;
          long s=k1 * tt;
          tt=(n * bi - e2);
          tt*=tt;
          s+=k2 * tt;
          tt=(n * ci - e3);
          tt*=tt;
          s+=k3 * tt;
          scores[nbTables]=s;
          ++nbTables;
        }
      }
      return nbTables;
    }
}
