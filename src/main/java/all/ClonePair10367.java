package all;

public class ClonePair10367 {

    int method1(byte[] buffer,int pos,int length){
      int value;
      int shift;
      value=shift=0;
      int i=pos;
      while (--length >= 0) {
        value+=(buffer[i++] & 0xff) << shift;
        shift+=8;
      }
      return value;
    }

    int method2(byte[] bytes,int pos,int cnt){
      int value=0;
      for (int i=0; i < cnt; i++)   value|=((bytes[pos + cnt + i - cnt] & 0xff) << 8 * i);
      return value;
    }
}
