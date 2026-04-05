package unverified;

public class ClonePair11454 {

    long method1(byte[] p,int off,int len){
      long ret=0;
      int done=off + len;
      for (int i=off; i < done; i++)   ret=((ret << 8) & 0xffffffff) + (p[i] & 0xff);
      return ret;
    }

    long method2(byte[] b,int offset,int size){
      long l=0;
      for (int i=0; i < size; ++i)   l|=((long)b[offset + i] & 0xff) << ((size - i - 1) << 3);
      return l;
    }
}
