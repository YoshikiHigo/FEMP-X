package unverified;

public class ClonePair6872 {

    int method1(byte[] array,int offset){
      int value=0;
      for (int i=0; i < 4; i++) {
        value+=(array[offset + i] & 0xff) << (8 * i);
      }
      return value;
    }

    int method2(byte[] data,int offset){
      int num=0;
      for (int i=offset + 3; i > offset - 1; i--) {
        num<<=8;
        num|=(data[i] & 0xff);
      }
      return num;
    }
}
