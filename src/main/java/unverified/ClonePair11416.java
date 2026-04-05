package unverified;

public class ClonePair11416 {

    long method1(byte[] ar,int offset,int length){
      long rs=0;
      for (int i=0; i < length; i++) {
        rs+=(long)(ar[offset + i] & 0xFF) << (i * 8);
      }
      return rs;
    }

    long method2(byte[] data,int offset,int bytes){
      long ret=0;
      for (int i=0; i < bytes; i++)   ret|=(((long)data[i + offset]) & 0xFF) << (i * 8);
      return ret;
    }
}
