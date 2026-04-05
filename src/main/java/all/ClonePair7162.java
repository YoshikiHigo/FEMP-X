package all;

public class ClonePair7162 {

    double method1(int[] t){
      int a=t[0], b=t[1], c=t[2], d=t[3], e=t[4], f=t[5];
      @SuppressWarnings("unused") int b_min=0, b_max=0, ai, bi, ci, di, ei, fi;
      double pvalue=0;
      int c1=a + d, c2=b + e, c3=c + f;
      int n1=a + b + c, n2=d + e + f, n=n1 + n2;
      int b0=c2 + n1 + c1 - n;
      int a_min=Math.max(0,c1 - n2), a_max=Math.min(c1,n1);
      final int radius=Math.max(a - a_min,a_max - a);
      int last_a=-1;
      for (int k=0; k <= radius; k++) {
        for (int s=-1; s < 2; s+=2) {
          ai=a + s * k;
          if (ai == last_a)       continue;
          if (ai >= a_min && ai <= a_max) {
            b_min=Math.max(0,b0 - ai);
            b_max=Math.min(n1 - ai,c2);
            di=c1 - ai;
            for (bi=b_min; bi <= b_max; bi++) {
              ci=n1 - ai - bi;
              ei=c2 - bi;
              fi=c3 - ci;
            }
            last_a=ai;
          }
        }
      }
      pvalue=Math.max(0,pvalue);
      return Math.min(pvalue,1);
    }

    double method2(int[] bytes){
      int exponent=bytes[0] - 160;
      double mantisse=0;
      for (int i=1; i < 5; i++)   mantisse=mantisse * 0x100 + bytes[i];
      int sign=1;
      if ((bytes[1] & 0x80) != 0)   sign=-1;
     else   mantisse+=2147483648.0;
      return sign * mantisse * Math.pow(2,exponent);
    }
}
