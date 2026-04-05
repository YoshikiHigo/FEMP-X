package unverified;

public class ClonePair11417 {

    long method1(byte[] ar,int offset,int length){
      long rs=0;
      for (int i=0; i < length; i++) {
        rs+=(long)(ar[offset + i] & 0xFF) << (i * 8);
      }
      return rs;
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
