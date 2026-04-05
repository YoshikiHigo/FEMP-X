package all;

public class ClonePair2124 {

    int method1(byte[] input){
      int result=0;
      if (input.length != 4) {
        return 0;
      }
      result^=(input[0] & 0xff) << 24;
      result^=(input[1] & 0xff) << 16;
      result^=(input[2] & 0xff) << 8;
      result^=input[3] & 0xff;
      return result;
    }

    int method2(byte[] b){
      if (b.length != 4) {
        return 0;
      }
      int bInt=(b[0] << 24 & 0xFF000000) | (b[1] << 16 & 0x00FF0000) | (b[2] << 8 & 0x0000FF00)| (b[3] & 0x000000FF);
      return bInt;
    }
}
