package all;

public class ClonePair10064 {

    int method1(byte[] bArray,int start,int len){
      int result=0;
      for (int i=0; i < len; i++) {
        result<<=8;
        result|=((int)bArray[start + i] & 0xff);
      }
      return result;
    }

    int method2(byte[] bytes,int pos,int cnt){
      int value=0;
      for (int i=0; i < cnt; i++)   value|=((bytes[pos + cnt - i - 1] & 0xff) << 8 * i);
      return value;
    }
}
