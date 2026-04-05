package all;

public class ClonePair7495 {

    int method1(byte[] buf,int ofs){
      int ret=0, reg;
      int len=buf.length;
      if (4 < len)   len=4;
      for (int cc=ofs, sh=24; cc < len; cc++, sh-=4) {
        reg=(buf[cc] & 0xff);
        ret+=reg << sh;
      }
      return ret;
    }

    int method2(byte[] bytes,int offset){
      int result=0x00000000;
      int length=0;
      if (bytes.length - offset < 4)   length=bytes.length - offset;
     else   length=4;
      int end=offset + length;
      for (int i=0; i < length; i++) {
        result|=(bytes[end - i - 1] & 0xff) << (8 * i);
      }
      return result;
    }
}
