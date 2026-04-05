package unverified;

public class ClonePair6377 {

    long method1(byte[] arr,int ofs){
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

    long method2(byte[] data,int offset){
      long result=0;
      int i=offset;
      for (int shiftBy=0; shiftBy < 64; shiftBy+=8) {
        result|=((long)(data[i] & 0xff)) << shiftBy;
        ++i;
      }
      return result;
    }
}
