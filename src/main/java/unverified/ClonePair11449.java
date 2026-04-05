package unverified;

public class ClonePair11449 {

    long method1(byte[] data,int offset,int bytes){
      long ret=0;
      for (int i=0; i < bytes; i++)   ret|=(((long)data[i + offset]) & 0xFF) << (i * 8);
      return ret;
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
