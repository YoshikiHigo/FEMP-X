package all;

public class ClonePair6374 {

    long method1(byte[] data,int offset){
      long ret=data[offset];
      for (int i=1; i < 8; ++i) {
        ret=ret << 8;
        ret=ret | (data[offset + i] & 0xff);
      }
      return ret;
    }

    long method2(byte[] data,int offset){
      long num=0;
      for (int i=offset; i < offset + 8; i++) {
        num<<=8;
        num|=(data[i] & 0xff);
      }
      return num;
    }
}
