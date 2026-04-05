package unverified;

public class ClonePair520 {

    boolean method1(byte[] s1,byte[] s2){
      int len=s1.length;
      for (int i=0; i < len; i++) {
        if (s1[i] != s2[i]) {
          return (false);
        }
      }
      return (true);
    }

    boolean method2(byte[] a,byte[] b){
      for (int i=0; i != a.length; i++) {
        if (a[i] != b[i]) {
          return false;
        }
      }
      return true;
    }
}
