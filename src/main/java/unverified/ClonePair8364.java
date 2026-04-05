package unverified;

public class ClonePair8364 {

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

    int method2(int y){
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
}
