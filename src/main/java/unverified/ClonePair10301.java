package unverified;

public class ClonePair10301 {

    int method1(byte[] sbuf,int pos,int numBytes){
      int result=0;
      for (int i=0; i < numBytes; i++)   result=(result << 8) + (sbuf[pos + i] & 0xff);
      return result;
    }

    int method2(byte[] buff,int off,int len){
      int num=0;
      int shift=0;
      for (int i=off + len - 1; i >= off; i--) {
        num+=(buff[i] & 0xFF) << shift;
        shift+=8;
      }
      return num;
    }
}
