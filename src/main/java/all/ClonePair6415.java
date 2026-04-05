package all;

public class ClonePair6415 {

    long method1(byte[] data,int offset){
      long value=0;
      for (int i=offset + 7; i >= offset; i--) {
        value<<=8;
        value|=((long)data[i]) & 0xff;
      }
      return value;
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
