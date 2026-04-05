package all;

public class ClonePair2300 {

    int method1(byte[] b){
      if (b.length == 1)   return b[0] & 0xFF;
     else   if (b.length == 2)   return (b[0] & 0xFF) | ((b[1] & 0xFF) << 8);
     else   if (b.length == 3)   return (b[0] & 0xFF) | ((b[1] & 0xFF) << 8) | ((b[2] & 0xFF) << 16);
     else   if (b.length == 4)   return (b[0] & 0xFF) | ((b[1] & 0xFF) << 8) | ((b[2] & 0xFF) << 16)| ((b[3] & 0xFF) << 24);
     else   return 0;
    }

    int method2(byte[] b){
      if (b.length == 1) {
        return b[0] & 0xFF;
      }
     else   if (b.length == 2) {
        return (b[0] & 0xFF) | ((b[1] & 0xFF) << 8);
      }
     else   if (b.length == 3) {
        return (b[0] & 0xFF) | ((b[1] & 0xFF) << 8) | ((b[2] & 0xFF) << 16);
      }
     else   if (b.length == 4) {
        return (b[0] & 0xFF) | ((b[1] & 0xFF) << 8) | ((b[2] & 0xFF) << 16)| ((b[3] & 0xFF) << 24);
      }
     else {
        return 0;
      }
    }
}
