package all;

public class ClonePair7984 {

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

    String method2(byte[] data,int nStartPos,int nNumOfBytes){
      nNumOfBytes&=~1;
      int nAvailCapacity=data.length - nStartPos;
      if (nAvailCapacity < nNumOfBytes)   nNumOfBytes=nAvailCapacity;
      StringBuffer sbuf=new StringBuffer();
      sbuf.setLength(nNumOfBytes >> 1);
      int nSBufPos=0;
      while (nNumOfBytes > 0) {
        sbuf.setCharAt(nSBufPos++,(char)(((int)data[nStartPos] << 8) | ((int)data[nStartPos + 1] & 0x0ff)));
        nStartPos+=2;
        nNumOfBytes-=2;
      }
      ;
      return sbuf.toString();
    }
}
