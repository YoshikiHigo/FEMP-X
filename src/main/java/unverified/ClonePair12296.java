package unverified;

public class ClonePair12296 {

    long method1(long u,long v){
      int shift;
      if (u == 0 || v == 0)   return u | v;
      for (shift=0; ((u | v) & 1) == 0; ++shift) {
        u>>=1;
        v>>=1;
      }
      while ((u & 1) == 0)   u>>=1;
      do {
        while ((v & 1) == 0)     v>>=1;
        if (u < v) {
          v-=u;
        }
     else {
          long diff=u - v;
          u=v;
          v=diff;
        }
        v>>=1;
      }
     while (v != 0);
      return u << shift;
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
