package unverified;

public class ClonePair11452 {

    long method1(byte[] bytes,int pos,int cnt){
      long value=0;
      for (int i=0; i < cnt; i++)   value|=((bytes[pos + cnt - i - 1] & 0xffL) << 8 * i);
      return value;
    }

    long method2(byte[] b,int offset,int size){
      long l=0;
      for (int i=0; i < size; ++i)   l|=((long)b[offset + i] & 0xff) << ((size - i - 1) << 3);
      return l;
    }
}
