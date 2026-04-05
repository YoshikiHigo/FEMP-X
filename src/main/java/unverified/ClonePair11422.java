package unverified;

public class ClonePair11422 {

    long method1(byte[] b,int offset,int size){
      long value=0;
      for (int i=0; i < size; i++) {
        value=(value << 8) | (b[offset + i] & 0xFF);
      }
      return value;
    }

    long method2(byte[] arr,int idx,int bytenum){
      long n=0;
      for (int i=0; i < bytenum; i++) {
        n<<=8;
        n|=(int)(arr[idx + i] & 0xff);
      }
      return n;
    }
}
