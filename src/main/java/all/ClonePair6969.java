package all;

public class ClonePair6969 {

    int method1(byte[] data,int offset){
      byte[] tmp=new byte[4];
      System.arraycopy(data,offset,tmp,0,4);
      int number;
      number=0;
      for (int i=0; i < 4; ++i) {
        number|=(tmp[3 - i] & 0xff) << (i << 3);
      }
      return number;
    }

    int method2(byte[] array,int offset){
      int value=0;
      for (int i=0; i < 4; i++) {
        value=(value << 8) + (array[offset + i] & 0xff);
      }
      return value;
    }
}
