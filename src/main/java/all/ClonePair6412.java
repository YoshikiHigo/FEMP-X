package all;

public class ClonePair6412 {

    long method1(byte[] data,int offset){
      long value=0;
      for (int i=offset + 7; i >= offset; i--) {
        value<<=8;
        value|=((long)data[i]) & 0xff;
      }
      return value;
    }

    long method2(byte[] in,int idx){
      long out=0;
      for (int i=0; i < 8; i++)   out|=((long)in[idx + i] & 0xff) << i * 8;
      return out;
    }
}
