package all;

public class ClonePair3954 {

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
