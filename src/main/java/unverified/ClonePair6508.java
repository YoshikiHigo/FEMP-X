package unverified;

public class ClonePair6508 {

    long method1(byte[] input,int offset){
      long result=0;
      for (int i=0; i < 8; i++) {
        if (i + offset < input.length) {
          result|=(((long)input[i + offset]) & 0xffL) << ((7 - i) * 8);
        }
      }
      return result;
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
