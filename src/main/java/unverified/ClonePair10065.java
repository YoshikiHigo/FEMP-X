package unverified;

public class ClonePair10065 {

    int method1(byte[] bArray,int start,int len){
      int result=0;
      for (int i=0; i < len; i++) {
        result<<=8;
        result|=((int)bArray[start + i] & 0xff);
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
