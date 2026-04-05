package all;

public class ClonePair10350 {

    int method1(byte[] bytes,int pos,int cnt){
      int value=0;
      for (int i=0; i < cnt; i++)   value|=((bytes[pos + cnt - i - 1] & 0xff) << 8 * i);
      return value;
    }

    int method2(byte[] bytes,int offset,int length){
      int result=0;
      int end=offset + length;
      for (int i=offset; i < end; i++) {
        result=(result << 8) + (bytes[i] & 0xFF);
      }
      return result;
    }
}
