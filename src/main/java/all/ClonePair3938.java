package all;

public class ClonePair3938 {

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

    int method2(byte[] key1,byte[] key2){
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
}
