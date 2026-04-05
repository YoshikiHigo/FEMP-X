package all;

public class ClonePair10021 {

    int method1(byte[] b,int offset,int length){
      int v=0;
      while (length-- > 0) {
        v=v << 8 | b[offset++] & 0xff;
      }
      return v;
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
