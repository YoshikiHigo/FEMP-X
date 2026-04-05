package all;

public class ClonePair12743 {

    short method1(byte[] bytes,int offset){
      short result=0x0000;
      int end=offset + 2;
      for (int i=0; i < 2; i++) {
        result|=(bytes[end - i - 1] & 0xff) << (8 * i);
      }
      return result;
    }

    short method2(byte[] b,int startPos){
      int result=0;
      for (int i=0; i < 2; i++) {
        result<<=8;
        result+=(int)(b[startPos + i] & 0xFF);
      }
      return (short)result;
    }
}
