package all;

public class ClonePair7982 {

    String method1(byte[] data,int nOfs,int nLen){
      int nAvailCapacity, nSBufPos;
      StringBuffer sbuf;
      nLen&=~1;
      nAvailCapacity=data.length - nOfs;
      if (nAvailCapacity < nLen) {
        nLen=nAvailCapacity;
      }
      sbuf=new StringBuffer();
      sbuf.setLength(nLen >> 1);
      nSBufPos=0;
      while (0 < nLen) {
        sbuf.setCharAt(nSBufPos++,(char)((data[nOfs] << 8) | (data[nOfs + 1] & 0x0ff)));
        nOfs+=2;
        nLen-=2;
      }
      return sbuf.toString();
    }

    String method2(byte[] data,int ofs,int len){
      len&=~1;
      final int availCapacity=data.length - ofs;
      if (availCapacity < len) {
        len=availCapacity;
      }
      final StringBuffer sbuf=new StringBuffer();
      sbuf.setLength(len >> 1);
      int sbufPos=0;
      while (0 < len) {
        sbuf.setCharAt(sbufPos++,(char)((data[ofs] << 8) | (data[ofs + 1] & 0x0ff)));
        ofs+=2;
        len-=2;
      }
      return sbuf.toString();
    }
}
