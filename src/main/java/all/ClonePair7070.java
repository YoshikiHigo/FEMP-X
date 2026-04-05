package all;

public class ClonePair7070 {

    int method1(byte[] msg,int start){
      if (msg.length <= start + 3) {
        return 0;
      }
      int r=0;
      r|=0x00FF & msg[start];
      r=r << 8;
      r|=0x00FF & msg[start + 1];
      r=r << 8;
      r|=0x00FF & msg[start + 2];
      r=r << 8;
      r|=0x00FF & msg[start + 3];
      return r;
    }

    int method2(byte[] bytes,int offset){
      int result=0x00000000;
      int length=0;
      if (bytes.length - offset < 4)   length=bytes.length - offset;
     else   length=4;
      int end=offset + length;
      for (int i=0; i < length; i++) {
        result|=(bytes[end - i - 1] & 0xff) << (8 * i);
      }
      return result;
    }
}
