package unverified;

public class ClonePair10042 {

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

    int method2(byte[] data,int offset,int length){
      int code=0;
      for (int i=0; i < length; i++) {
        code<<=8;
        code|=(data[offset + i] + 256) % 256;
      }
      return code;
    }
}
