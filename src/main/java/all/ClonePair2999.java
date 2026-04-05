package all;

public class ClonePair2999 {

    boolean method1(byte[] b1,byte[] b2){
      if (b1 == null || b2 == null) {
        return false;
      }
      if (b1.length == b2.length) {
        int i=0;
        int j=0;
        int n=b1.length;
        while (n-- != 0) {
          if (b1[i++] != b2[j++]) {
            return false;
          }
        }
        return true;
      }
      return false;
    }

    boolean method2(byte[] array1,byte[] array2){
      boolean compareresult=false;
      if ((array1 != null) && (array2 != null) && (array1.length == array2.length)) {
        compareresult=true;
        for (int i=0; i < array1.length; i++) {
          if (array1[i] != array2[i]) {
            compareresult=false;
            break;
          }
        }
      }
      return compareresult;
    }
}
