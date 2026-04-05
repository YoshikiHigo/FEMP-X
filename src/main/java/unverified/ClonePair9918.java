package unverified;

public class ClonePair9918 {

    int method1(byte[] arr,int offset,int bytes){
      int result=0;
      for (int i=0; i < bytes; i++) {
        result<<=8;
        result|=arr[offset++] & 0xFF;
      }
      return result;
    }

    int method2(byte[] data,int pos,int size){
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
}
