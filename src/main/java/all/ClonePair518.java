package all;

public class ClonePair518 {

    boolean method1(byte[] s1,byte[] s2){
      int len=s1.length;
      for (int i=0; i < len; i++) {
        if (s1[i] != s2[i]) {
          return (false);
        }
      }
      return (true);
    }

    boolean method2(byte[] header,byte[] full){
      int i=0;
      for (  byte b : header) {
        if (b != full[i++])     return false;
      }
      return true;
    }
}
