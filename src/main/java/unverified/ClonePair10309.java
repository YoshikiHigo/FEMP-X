package unverified;

public class ClonePair10309 {

    int method1(byte[] sbuf,int pos,int numBytes){
      int result=0;
      for (int i=0; i < numBytes; i++)   result=(result << 8) + (sbuf[pos + i] & 0xff);
      return result;
    }

    int method2(byte[] content,int index,int size){
      int result=0;
      for (int i=0; i < size; i++) {
        result=(result << 8) + (content[index + i] & 0xff);
      }
      return result;
    }
}
