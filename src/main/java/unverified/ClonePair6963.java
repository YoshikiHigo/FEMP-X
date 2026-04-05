package unverified;

public class ClonePair6963 {

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

    int method2(byte[] data,int offset){
      int res=0;
      for (int i=0; i < 4; i++) {
        res=(res << 8) | (data[offset + i] & 0xff);
      }
      return res;
    }
}
