package all;

public class ClonePair7069 {

    int method1(byte[] msg,int start){
      if (msg.length <= start + 3) {
        return 0;
      }
      int r=0;
      r|=0x00FF & msg[start];
      r=r << 8;
      r|=0x00FF & msg[start + 1];
      r=r << 8;
      r|=0x00FF & msg[start + 2];
      r=r << 8;
      r|=0x00FF & msg[start + 3];
      return r;
    }

    int method2(byte[] buf,int ofs){
      int ret=0, reg;
      int len=buf.length;
      if (4 < len)   len=4;
      for (int cc=ofs, sh=24; cc < len; cc++, sh-=4) {
        reg=(buf[cc] & 0xff);
        ret+=reg << sh;
      }
      return ret;
    }
}
