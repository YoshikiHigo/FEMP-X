package unverified;

public class ClonePair11442 {

    long method1(byte[] rep,int off,int len){
      long l=0;
      for (int i=0; i < len; i++)   l|=((long)(rep[i + off] & 0xFF)) << (8 * i);
      return l;
    }

    long method2(byte[] data,int offset,int size){
      long result=0;
      for (int j=offset + size - 1; j >= offset; j--) {
        result<<=8;
        result|=0xff & data[j];
      }
      return result;
    }
}
