package all;

public class ClonePair1171 {

    boolean method1(byte[] header,byte[] full){
      int i=0;
      for (  byte b : header) {
        if (b != full[i++])     return false;
      }
      return true;
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
