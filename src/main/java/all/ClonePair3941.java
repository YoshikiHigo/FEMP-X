package all;

public class ClonePair3941 {

    int method1(byte[] b1,byte[] b2){
      int max=Math.min(b1.length,b2.length);
      for (int i=0; i < max; i++) {
        int byte1=(b1[i] & 0xff);
        int byte2=(b2[i] & 0xff);
        int diff=byte1 - byte2;
        if (diff != 0)     return diff;
      }
      return b1.length - b2.length;
    }

    int method2(byte[] bytes1,byte[] bytes2){
      int diff;
      for (int i=0; i < bytes1.length && i < bytes2.length; i++) {
        diff=(bytes1[i] & 0xFF) - (bytes2[i] & 0xFF);
        if (diff != 0) {
          return diff;
        }
      }
      return bytes1.length - bytes2.length;
    }
}
