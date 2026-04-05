package all;

public class ClonePair3968 {

    int method1(byte[] tok,byte[] tok2){
      final int l=Math.min(tok.length,tok2.length);
      for (int i=0; i != l; i++) {
        final int c=(tok[i] & 0xFF) - (tok2[i] & 0xFF);
        if (c != 0)     return c;
      }
      return tok.length - tok2.length;
    }

    int method2(byte[] a,byte[] b){
      int len=Math.min(a.length,b.length);
      for (int i=0; i < len; i++) {
        byte ai=a[i];
        byte bi=b[i];
        if (ai != bi) {
          return (ai & 0xff) - (bi & 0xff);
        }
      }
      return a.length - b.length;
    }
}
