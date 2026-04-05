package all;

public class ClonePair12287 {

    long method1(long p,long q){
      long shift;
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
          final long diff=p - q;
          p=q;
          q=diff;
        }
        q>>>=1;
      }
     while (q != 0);
      return p << shift;
    }

    long method2(long op1,long op2){
      int lsb1=Long.numberOfTrailingZeros(op1);
      int lsb2=Long.numberOfTrailingZeros(op2);
      int pow2Count=Math.min(lsb1,lsb2);
      if (lsb1 != 0) {
        op1>>>=lsb1;
      }
      if (lsb2 != 0) {
        op2>>>=lsb2;
      }
      do {
        if (op1 >= op2) {
          op1-=op2;
          op1>>>=Long.numberOfTrailingZeros(op1);
        }
     else {
          op2-=op1;
          op2>>>=Long.numberOfTrailingZeros(op2);
        }
      }
     while (op1 != 0);
      return (op2 << pow2Count);
    }
}
