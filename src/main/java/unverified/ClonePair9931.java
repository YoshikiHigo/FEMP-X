package unverified;

public class ClonePair9931 {

    int method1(byte[] arr,int offset,int bytes){
      int result=0;
      for (int i=0; i < bytes; i++) {
        result<<=8;
        result|=arr[offset++] & 0xFF;
      }
      return result;
    }

    int method2(byte[] data,int offset,int bytes){
      int result=0;
      for (int i=offset; i < offset + bytes; i++) {
        result*=256;
        int b=data[i];
        if (b < 0) {
          b+=256;
        }
        result+=b;
      }
      return result;
    }
}
