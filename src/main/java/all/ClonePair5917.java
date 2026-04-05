package all;

public class ClonePair5917 {

    long method1(int c,long[][] p){
      long out=0L;
      for (int i=4; --i >= 0; ) {
        int t=(int)(0x00ff & c);
        c>>=8;
        long tp=p[i << 1][t & 0x0f];
        out|=tp;
        tp=p[(i << 1) + 1][t >> 4];
        out|=tp;
      }
      return out;
    }

    long method2(int c,long[][] p){
      long out=0L;
      for (int i=4; --i >= 0; ) {
        int t=(0x00ff & c);
        c>>=8;
        long tp=p[i << 1][t & 0x0f];
        out|=tp;
        tp=p[(i << 1) + 1][t >> 4];
        out|=tp;
      }
      return out;
    }
}
