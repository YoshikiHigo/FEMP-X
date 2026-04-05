package all;

public class ClonePair2050 {

    boolean method1(byte[] b1,byte[] b2){
      if ((b1 == null) || (b2 == null))   return false;
      if (b1.length != b2.length)   return false;
      for (int i=0; i < b1.length; i++) {
        if (b1[i] != b2[i])     return false;
      }
      return true;
    }

    boolean method2(byte[] first,byte[] second){
      boolean out=first != null && second != null && first.length == second.length;
      for (int i=0; out && i < first.length; i++) {
        if (first[i] != second[i]) {
          out=false;
        }
      }
      return out;
    }
}
