package unverified;

public class ClonePair10256 {

    int method1(byte[] bytes,int offset,int length){
      int sum=0;
      for (int i=0; i < length; i++)   sum^=bytes[offset + i];
      return sum;
    }

    int method2(byte[] key,int off,int len){
      int h=0;
      for (int i=0; i < len; i++) {
        h=31 * h + key[off++];
      }
      return h;
    }
}
