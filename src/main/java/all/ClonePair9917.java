package all;

public class ClonePair9917 {

    int method1(byte[] arr,int offset,int bytes){
      int result=0;
      for (int i=0; i < bytes; i++) {
        result<<=8;
        result|=arr[offset++] & 0xFF;
      }
      return result;
    }

    int method2(byte[] b,int offset,int length){
      int v=0;
      while (length-- > 0) {
        v=v << 8 | b[offset++] & 0xff;
      }
      return v;
    }
}
