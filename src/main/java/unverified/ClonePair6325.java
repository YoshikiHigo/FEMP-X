package unverified;

public class ClonePair6325 {

    long method1(byte[] data,int offset){
      long x=0;
      for (int i=7; i >= 0; i--) {
        long y=data[offset + i] & 0xFF;
        x=(x << 8) | y;
      }
      return x;
    }

    long method2(byte[] arr,int ofs){
      byte[] tmp=new byte[8];
      for (int i=0; i < 8; i++) {
        tmp[i]=arr[ofs + i];
      }
      long accum=0;
      int i=0;
      for (int shiftBy=0; shiftBy < 64; shiftBy+=8) {
        accum|=((long)(tmp[i] & 0xff)) << shiftBy;
        i++;
      }
      return accum;
    }
}
