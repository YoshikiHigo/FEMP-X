package unverified;

public class ClonePair10433 {

    int method1(byte[] data,int offset,int length){
      int code=0;
      for (int i=0; i < length; i++) {
        code<<=8;
        code|=(data[offset + i] + 256) % 256;
      }
      return code;
    }

    int method2(byte[] content,int index,int size){
      int result=0;
      for (int i=0; i < size; i++) {
        result=(result << 8) + (content[index + i] & 0xff);
      }
      return result;
    }
}
