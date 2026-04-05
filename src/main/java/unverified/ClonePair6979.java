package unverified;

public class ClonePair6979 {

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

    int method2(byte[] bytes,int offset){
      int b=0;
      for (int j=0; j < 4; j++)   b=(b << 8) | (bytes[j + offset] & 0xFF);
      return b;
    }
}
