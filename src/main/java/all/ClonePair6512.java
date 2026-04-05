package all;

public class ClonePair6512 {

    long method1(byte[] buf,int ofs){
      long ret=0, reg;
      int len=buf.length;
      if (8 < len)   len=8;
      for (int cc=ofs, sh=56; cc < len; cc++, sh-=8) {
        reg=(buf[cc] & 0xff);
        ret|=reg << sh;
      }
      return ret;
    }

    long method2(byte[] buf,int ofs){
      long ret=0, reg;
      int len=buf.length;
      if (8 < len)   len=8;
      for (int cc=ofs, sh=56; cc < len; cc++, sh-=8) {
        reg=(buf[cc] & 0xff);
        ret+=reg << sh;
      }
      return ret;
    }
}
