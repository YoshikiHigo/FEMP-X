package unverified;

public class ClonePair6978 {

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

    int method2(byte[] b,int offset){
      int value=0;
      for (int i=0; i < 4; i++) {
        int shift=(4 - 1 - i) * 8;
        value+=(b[i + offset] & 0x000000FF) << shift;
      }
      return value;
    }
}
