package all;

public class ClonePair2359 {

    int method1(byte[] b){
      if (b.length != 4)   return 0;
      return (b[0] << 24) + ((b[1] & 0xFF) << 16) + ((b[2] & 0xFF) << 8)+ (b[3] & 0xFF);
    }

    int method2(byte[] b){
      if (b.length != 4) {
        return 0;
      }
      int bInt=(b[0] << 24 & 0xFF000000) | (b[1] << 16 & 0x00FF0000) | (b[2] << 8 & 0x0000FF00)| (b[3] & 0x000000FF);
      return bInt;
    }
}
