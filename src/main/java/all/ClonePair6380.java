package all;

public class ClonePair6380 {

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

    long method2(byte[] in,int idx){
      long out=0;
      for (int i=0; i < 8; i++)   out|=((long)in[idx + i] & 0xff) << i * 8;
      return out;
    }
}
