package all;

public class ClonePair10419 {

    int method1(byte[] buff,int off,int len){
      int num=0;
      int shift=0;
      for (int i=off + len - 1; i >= off; i--) {
        num+=(buff[i] & 0xFF) << shift;
        shift+=8;
      }
      return num;
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
