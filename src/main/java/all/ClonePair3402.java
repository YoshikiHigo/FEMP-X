package all;

public class ClonePair3402 {

    long method1(long N,int D){
      long q, r;
      long a1=N >>> 32;
      long a0=N & 0xffffffffL;
      if (D >= 0) {
        if (a1 < ((D - a1 - (a0 >>> 31)) & 0xffffffffL)) {
          q=N / D;
          r=N % D;
        }
     else {
          long c=N - ((long)D << 31);
          q=c / D;
          r=c % D;
          q+=1 << 31;
        }
      }
     else {
        long b1=D >>> 1;
        long c=N >>> 1;
        if (a1 < b1 || (a1 >> 1) < b1) {
          if (a1 < b1) {
            q=c / b1;
            r=c % b1;
          }
     else {
            c=~(c - (b1 << 32));
            q=c / b1;
            r=c % b1;
            q=(~q) & 0xffffffffL;
            r=(b1 - 1) - r;
          }
          r=2 * r + (a0 & 1);
          if ((D & 1) != 0) {
            if (r >= q) {
              r=r - q;
            }
     else         if (q - r <= ((long)D & 0xffffffffL)) {
              r=r - q + D;
              q-=1;
            }
     else {
              r=r - q + D + D;
              q-=2;
            }
          }
        }
     else {
          if (a0 >= ((long)(-D) & 0xffffffffL)) {
            q=-1;
            r=a0 + D;
          }
     else {
            q=-2;
            r=a0 + D + D;
          }
        }
      }
      return (r << 32) | (q & 0xFFFFFFFFl);
    }

    long method2(long N,int D){
      long q, r;
      long a1=N >>> 32;
      long a0=N & 0xffffffffL;
      if (D >= 0) {
        if (a1 < ((D - a1 - (a0 >>> 31)) & 0xffffffffL)) {
          q=N / D;
          r=N % D;
        }
     else {
          long c=N - ((long)D << 31);
          q=c / D;
          r=c % D;
          q+=1 << 31;
        }
      }
     else {
        long b1=D >>> 1;
        long c=N >>> 1;
        if (a1 < b1 || (a1 >> 1) < b1) {
          if (a1 < b1) {
            q=c / b1;
            r=c % b1;
          }
     else {
            c=~(c - (b1 << 32));
            q=c / b1;
            r=c % b1;
            q=(~q) & 0xffffffffL;
            r=(b1 - 1) - r;
          }
          r=2 * r + (a0 & 1);
          if ((D & 1) != 0) {
            if (r >= q) {
              r=r - q;
            }
     else         if (q - r <= (D & 0xffffffffL)) {
              r=r - q + D;
              q-=1;
            }
     else {
              r=r - q + D + D;
              q-=2;
            }
          }
        }
     else {
          if (a0 >= ((-D) & 0xffffffffL)) {
            q=-1;
            r=a0 + D;
          }
     else {
            q=-2;
            r=a0 + D + D;
          }
        }
      }
      return (r << 32) | (q & 0xFFFFFFFFl);
    }
}
