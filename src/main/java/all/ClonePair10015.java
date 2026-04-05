package all;

public class ClonePair10015 {

    int method1(byte[] b,int offset,int length){
      int v=0;
      while (length-- > 0) {
        v=v << 8 | b[offset++] & 0xff;
      }
      return v;
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
