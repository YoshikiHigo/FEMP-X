package all;

public class ClonePair3969 {

    int method1(byte[] tok,byte[] tok2){
      final int l=Math.min(tok.length,tok2.length);
      for (int i=0; i != l; i++) {
        final int c=(tok[i] & 0xFF) - (tok2[i] & 0xFF);
        if (c != 0)     return c;
      }
      return tok.length - tok2.length;
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
