package all;

public class ClonePair5942 {

    long method1(int[] x,int len,int count){
      int wordno=count >> 5;
      count&=31;
      int sign=x[len - 1] < 0 ? -1 : 0;
      int w0=wordno >= len ? sign : x[wordno];
      wordno++;
      int w1=wordno >= len ? sign : x[wordno];
      if (count != 0) {
        wordno++;
        int w2=wordno >= len ? sign : x[wordno];
        w0=(w0 >>> count) | (w1 << (32 - count));
        w1=(w1 >>> count) | (w2 << (32 - count));
      }
      return ((long)w1 << 32) | (w0 & 0xffffffffL);
    }

    long method2(int[] x,int len,int count){
      int wordno=count >> 5;
      count&=31;
      int sign=x[len - 1] < 0 ? -1 : 0;
      int w0=wordno >= len ? sign : x[wordno];
      wordno++;
      int w1=wordno >= len ? sign : x[wordno];
      if (count != 0) {
        wordno++;
        int w2=wordno >= len ? sign : x[wordno];
        w0=(w0 >>> count) | (w1 << (32 - count));
        w1=(w1 >>> count) | (w2 << (32 - count));
      }
      return ((long)w1 << 32) | ((long)w0 & 0xffffffffL);
    }
}
