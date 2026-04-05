package unverified;

public class ClonePair3940 {

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
