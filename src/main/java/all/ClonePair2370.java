package all;

public class ClonePair2370 {

    int method1(byte[] b){
      if (b.length != 4)   return 0;
      return (b[0] << 24) + ((b[1] & 0xFF) << 16) + ((b[2] & 0xFF) << 8)+ (b[3] & 0xFF);
    }

    int method2(byte[] b){
      if (b.length != 4)   return 0;
      return ((b[0] & 0xFF) << 24) | ((b[1] & 0xFF) << 16) | ((b[2] & 0xFF) << 8)| ((b[3] & 0xFF) << 0);
    }
}
