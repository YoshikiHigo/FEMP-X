package all;

public class ClonePair9929 {

    int method1(byte[] arr,int offset,int bytes){
      int result=0;
      for (int i=0; i < bytes; i++) {
        result<<=8;
        result|=arr[offset++] & 0xFF;
      }
      return result;
    }

    int method2(byte[] bytes,int pos,int cnt){
      int value=0;
      for (int i=0; i < cnt; i++)   value|=((bytes[pos + cnt - i - 1] & 0xff) << 8 * i);
      return value;
    }
}
