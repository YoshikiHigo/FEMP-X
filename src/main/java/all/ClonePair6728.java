package all;

public class ClonePair6728 {

    long method1(byte[] buf){
      long[] lbuf=new long[4];
      for (int i=0; i < 4; i++) {
        lbuf[i]=buf[i];
        if (lbuf[i] < 0)     lbuf[i]+=0x100;
      }
      return ((long)(lbuf[3] * 0x1000000 + lbuf[2] * 0x10000 + lbuf[1] * 0x100 + lbuf[0]));
    }

    long method2(byte[] bytes){
      long[] ints=new long[4];
      for (int i=0; i < ints.length; i++) {
        if (bytes[i] < 0)     ints[i]=(long)(256 + (int)bytes[i]);
     else     ints[i]=(long)bytes[i];
      }
      for (int i=0; i < ints.length; i++) {
        ints[i]=(ints[i]) * (long)Math.pow(2,(8 * i));
      }
      return ints[3] + ints[2] + ints[1]+ ints[0];
    }
}
