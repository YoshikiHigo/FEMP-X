package unverified;

public class ClonePair11441 {

    long method1(byte[] rep,int off,int len){
      long l=0;
      for (int i=0; i < len; i++)   l|=((long)(rep[i + off] & 0xFF)) << (8 * i);
      return l;
    }

    long method2(byte[] data,int offset,int bytes){
      long ret=0;
      for (int i=0; i < bytes; i++)   ret|=(((long)data[i + offset]) & 0xFF) << (i * 8);
      return ret;
    }
}
