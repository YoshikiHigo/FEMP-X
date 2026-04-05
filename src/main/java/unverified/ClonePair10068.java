package unverified;

public class ClonePair10068 {

    int method1(byte[] bArray,int start,int len){
      int result=0;
      for (int i=0; i < len; i++) {
        result<<=8;
        result|=((int)bArray[start + i] & 0xff);
      }
      return result;
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
