package unverified;

public class ClonePair10043 {

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

    int method2(byte[] bytes,int offset,int length){
      int result=0;
      int end=offset + length;
      for (int i=offset; i < end; i++) {
        result=(result << 8) + (bytes[i] & 0xFF);
      }
      return result;
    }
}
