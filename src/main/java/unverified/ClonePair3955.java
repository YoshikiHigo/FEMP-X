package unverified;

public class ClonePair3955 {

    int method1(byte[] key1,byte[] key2){
      int a1Len=key1.length;
      int a2Len=key2.length;
      int limit=Math.min(a1Len,a2Len);
      for (int i=0; i < limit; i++) {
        byte b1=key1[i];
        byte b2=key2[i];
        if (b1 == b2) {
          continue;
        }
     else {
          return (b1 & 0xff) - (b2 & 0xff);
        }
      }
      return (a1Len - a2Len);
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
