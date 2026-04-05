package unverified;

public class ClonePair10024 {

    int method1(byte[] b,int offset,int length){
      int v=0;
      while (length-- > 0) {
        v=v << 8 | b[offset++] & 0xff;
      }
      return v;
    }

    int method2(byte[] content,int index,int size){
      int result=0;
      for (int i=0; i < size; i++) {
        result=(result << 8) + (content[index + i] & 0xff);
      }
      return result;
    }
}
