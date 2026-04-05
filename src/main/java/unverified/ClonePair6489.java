package unverified;

public class ClonePair6489 {

    long method1(byte[] in,int idx){
      long out=0;
      for (int i=0; i < 8; i++)   out|=((long)in[idx + i] & 0xff) << i * 8;
      return out;
    }

    long method2(byte[] data,int offset){
      long num=0;
      for (int i=offset + 7; i > offset - 1; i--) {
        num<<=8;
        num|=(data[i] & 0xff);
      }
      return num;
    }
}
