package unverified;

public class ClonePair8368 {

    int method1(int word){
      int i=0;
      while ((word & 0xF) == 0) {
        word>>=4;
        i+=4;
      }
      if ((word & 3) == 0) {
        word>>=2;
        i+=2;
      }
      if ((word & 1) == 0)   i+=1;
      return i;
    }

    int method2(int i){
      int y;
      if (i == 0)   return 32;
      int n=31;
      y=i << 16;
      if (y != 0) {
        n=n - 16;
        i=y;
      }
      y=i << 8;
      if (y != 0) {
        n=n - 8;
        i=y;
      }
      y=i << 4;
      if (y != 0) {
        n=n - 4;
        i=y;
      }
      y=i << 2;
      if (y != 0) {
        n=n - 2;
        i=y;
      }
      return n - ((i << 1) >>> 31);
    }
}
