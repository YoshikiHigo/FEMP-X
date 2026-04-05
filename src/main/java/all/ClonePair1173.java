package all;

public class ClonePair1173 {

    boolean method1(byte[] header,byte[] full){
      int i=0;
      for (  byte b : header) {
        if (b != full[i++])     return false;
      }
      return true;
    }

    boolean method2(byte[] first,byte[] seond){
      boolean startsWith=true;
      int i=0;
      for (  byte toComp : first) {
        if (toComp != seond[i++]) {
          startsWith=false;
          break;
        }
      }
      return startsWith;
    }
}
