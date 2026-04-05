package all;

public class ClonePair3971 {

    int method1(byte[] a,byte[] b){
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
