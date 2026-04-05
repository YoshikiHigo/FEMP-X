package all;

public class ClonePair9142 {

    int method1(int y){
      int k;
      int x=y;
      if ((x & 7) != 0) {
        if ((x & 1) != 0)     return 0;
        if ((x & 2) != 0) {
          return 1;
        }
        return 2;
      }
      k=0;
      if ((x & 0xffff) == 0) {
        k=16;
        x>>>=16;
      }
      if ((x & 0xff) == 0) {
        k+=8;
        x>>>=8;
      }
      if ((x & 0xf) == 0) {
        k+=4;
        x>>>=4;
      }
      if ((x & 0x3) == 0) {
        k+=2;
        x>>>=2;
      }
      if ((x & 1) == 0) {
        k++;
        x>>>=1;
        if ((x & 1) == 0)     return 32;
      }
      return k;
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
