package unverified;

public class ClonePair10011 {

    int method1(byte[] b,int offset,int length){
      int v=0;
      while (length-- > 0) {
        v=v << 8 | b[offset++] & 0xff;
      }
      return v;
    }

    int method2(byte[] sbuf,int pos,int numBytes){
      int result=0;
      for (int i=0; i < numBytes; i++)   result=(result << 8) + (sbuf[pos + i] & 0xff);
      return result;
    }
}
