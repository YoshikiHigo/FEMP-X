package unverified;

public class ClonePair8065 {

    String method1(byte[] data,int ofs,int len){
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

    String method2(byte[] data,int nStartPos,int nNumOfBytes){
      nNumOfBytes&=~1;
      int nAvailCapacity=data.length - nStartPos;
      if (nAvailCapacity < nNumOfBytes) {
        nNumOfBytes=nAvailCapacity;
      }
      StringBuffer sbuf=new StringBuffer();
      sbuf.setLength(nNumOfBytes >> 1);
      int nSBufPos=0;
      while (nNumOfBytes > 0) {
        sbuf.setCharAt(nSBufPos++,(char)(((int)data[nStartPos] << 8) | ((int)data[nStartPos + 1] & 0x0ff)));
        nStartPos+=2;
        nNumOfBytes-=2;
      }
      return sbuf.toString();
    }
}
