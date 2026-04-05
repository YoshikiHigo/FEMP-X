package unverified;

public class ClonePair10039 {

    int method1(byte[] data,int pos,int size){
      int retVal=0;
      int shifter=(size - 1) * 8;
      while (size > 0) {
        retVal+=(data[pos] & 0xff) << shifter;
        shifter-=8;
        pos++;
        size--;
      }
      return retVal;
    }

    int method2(byte[] sbuf,int pos,int numBytes){
      int result=0;
      for (int i=0; i < numBytes; i++)   result=(result << 8) + (sbuf[pos + i] & 0xff);
      return result;
    }
}
