package all;

public class ClonePair3962 {

    int method1(byte[] a,byte[] b){
      int len=Math.min(a.length,b.length);
      for (int i=0; i < len; i++) {
        byte ai=a[i];
        byte bi=b[i];
        if (ai != bi) {
          return ai - bi;
        }
      }
      return a.length - b.length;
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
