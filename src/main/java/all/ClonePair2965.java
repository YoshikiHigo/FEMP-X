package all;

public class ClonePair2965 {

    boolean method1(byte[] fixed,byte[] temp){
      for (int i=0; i < fixed.length; i++) {
        if (temp[i] != fixed[i])     return false;
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
