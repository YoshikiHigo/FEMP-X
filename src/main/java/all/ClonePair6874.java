package all;

public class ClonePair6874 {

    int method1(byte[] array,int offset){
      int value=0;
      for (int i=0; i < 4; i++) {
        value+=(array[offset + i] & 0xff) << (8 * i);
      }
      return value;
    }

    int method2(byte[] buff,int startPos){
      int res=0;
      for (int i=0; i < 4; i++)   res|=((buff[startPos + i] & 0xff) << (i * 8));
      return res;
    }
}
