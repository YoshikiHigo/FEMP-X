package all;

public class ClonePair6401 {

    long method1(byte[] array,int offset){
      long ret=0;
      for (int i=0; i < 8; i++) {
        ret<<=8;
        ret|=array[7 - i + offset] & 0xFF;
      }
      return ret;
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
