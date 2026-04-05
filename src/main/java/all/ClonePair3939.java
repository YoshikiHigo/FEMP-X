package all;

public class ClonePair3939 {

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

    int method2(byte[] tok,byte[] tok2){
      final int l=Math.min(tok.length,tok2.length);
      for (int i=0; i != l; i++) {
        final int c=(tok[i] & 0xFF) - (tok2[i] & 0xFF);
        if (c != 0)     return c;
      }
      return tok.length - tok2.length;
    }
}
