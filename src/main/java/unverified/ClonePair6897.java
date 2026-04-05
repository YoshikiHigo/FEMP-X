package unverified;

public class ClonePair6897 {

    int method1(byte[] data,int offset){
      int result=0;
      for (int i=(offset + 3); i >= offset; i--) {
        int temp=0xFF & data[i];
        result=result << 8;
        result=result | temp;
      }
      return result;
    }

    int method2(byte[] buff,int startPos){
      int res=0;
      for (int i=0; i < 4; i++)   res|=((buff[startPos + i] & 0xff) << (i * 8));
      return res;
    }
}
