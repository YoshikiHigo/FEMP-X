package unverified;

public class ClonePair3586 {

    boolean method1(int[] oid1,int[] oid2){
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

    boolean method2(int[] test1,int[] test2){
      boolean isEqual=true;
      if (test1.length != test2.length) {
        isEqual=false;
      }
     else {
        for (int i=0; i < test1.length; i++) {
          if (test1[i] != test2[i]) {
            isEqual=false;
            break;
          }
        }
      }
      return isEqual;
    }
}
