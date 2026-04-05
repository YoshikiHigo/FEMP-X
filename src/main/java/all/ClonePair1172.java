package all;

public class ClonePair1172 {

    boolean method1(byte[] header,byte[] full){
      int i=0;
      for (  byte b : header) {
        if (b != full[i++])     return false;
      }
      return true;
    }

    boolean method2(byte[] fixed,byte[] temp){
      for (int i=0; i < fixed.length; i++) {
        if (temp[i] != fixed[i])     return false;
      }
      return true;
    }
}
