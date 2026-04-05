package unverified;

public class ClonePair11425 {

    long method1(byte[] b,int offset,int size){
      long value=0;
      for (int i=0; i < size; i++) {
        value=(value << 8) | (b[offset + i] & 0xFF);
      }
      return value;
    }

    long method2(byte[] p,int off,int len){
      long ret=0;
      int done=off + len;
      for (int i=off; i < done; i++)   ret=((ret << 8) & 0xffffffff) + (p[i] & 0xff);
      return ret;
    }
}
