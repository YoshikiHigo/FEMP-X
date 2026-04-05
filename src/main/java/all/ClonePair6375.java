package all;

public class ClonePair6375 {

    long method1(byte[] data,int offset){
      long ret=data[offset];
      for (int i=1; i < 8; ++i) {
        ret=ret << 8;
        ret=ret | (data[offset + i] & 0xff);
      }
      return ret;
    }

    long method2(byte[] b,int start){
      long l=0;
      for (int i=0; i < 8; i++) {
        l<<=8;
        l|=b[start + i] & 0xff;
      }
      return l;
    }
}
