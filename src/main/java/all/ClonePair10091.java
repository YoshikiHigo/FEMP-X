package all;

public class ClonePair10091 {

    int method1(byte[] bytes,int offset,int len){
      int res=0;
      for (int i=offset; i < len + offset; i++) {
        int b=bytes[i];
        if ((b < 0) && (i != offset))     b+=256;
        res=(res << 8) | b;
      }
      return res;
    }

    int method2(byte[] key,int off,int len){
      int h=0;
      for (int i=0; i < len; i++) {
        h=31 * h + key[off++];
      }
      return h;
    }
}
