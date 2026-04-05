package all;

public class ClonePair12747 {

    short method1(byte[] bytes,int offset){
      short result=0x0000;
      int end=offset + 2;
      for (int i=0; i < 2; i++) {
        result|=(bytes[end - i - 1] & 0xff) << (8 * i);
      }
      return result;
    }

    short method2(byte[] data,int offset){
      short num=0;
      for (int i=offset; i < offset + 2; i++) {
        num<<=8;
        num|=(data[i] & 0xff);
      }
      return num;
    }
}
