package unverified;

public class ClonePair6387 {

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

    long method2(byte[] array,int index){
      long value=0;
      int shift=0;
      while (shift != 64) {
        value|=(0x00000000000000ff & ((long)array[index])) << shift;
        index++;
        shift+=8;
      }
      return value;
    }
}
