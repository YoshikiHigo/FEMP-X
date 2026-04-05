package all;

public class ClonePair6397 {

    long method1(byte[] array,int offset){
      long ret=0;
      for (int i=0; i < 8; i++) {
        ret<<=8;
        ret|=array[7 - i + offset] & 0xFF;
      }
      return ret;
    }

    long method2(byte[] in,int idx){
      long out=0;
      for (int i=0; i < 8; i++)   out|=((long)in[idx + i] & 0xff) << i * 8;
      return out;
    }
}
