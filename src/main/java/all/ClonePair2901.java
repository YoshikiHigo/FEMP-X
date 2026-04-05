package all;

public class ClonePair2901 {

    boolean method1(byte[] a,byte[] b){
      for (int i=0; i != a.length; i++) {
        if (a[i] != b[i]) {
          return false;
        }
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
