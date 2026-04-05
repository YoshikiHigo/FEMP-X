package all;

public class ClonePair3234 {

    boolean method1(int[] a,int[] b){
      if (a.length != b.length) {
        return (false);
      }
      for (int i=0; i < a.length; i++) {
        if (a[i] != b[i]) {
          return (false);
        }
      }
      return (true);
    }

    boolean method2(int[] oid1,int[] oid2){
      int length=oid1.length;
      if (length != oid2.length) {
        return false;
      }
      while (length > 0) {
        if (oid1[--length] != oid2[length]) {
          return false;
        }
      }
      return true;
    }
}
