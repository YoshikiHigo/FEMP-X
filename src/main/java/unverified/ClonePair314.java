package unverified;

public class ClonePair314 {

    boolean method1(byte[] b1,byte[] b2){
      int size1=b1.length;
      int size2=b2.length;
      if (size1 != size2) {
        return false;
      }
      for (int i=0; i < size1; i++) {
        if (b1[i] != b2[i]) {
          return false;
        }
      }
      return true;
    }

    boolean method2(byte[] b1,byte[] b2){
      boolean ret=false;
      if (b1.length == b2.length) {
        ret=true;
        for (int i=0; i < b1.length && ret; i++) {
          if (b1[i] != b2[i])       ret=false;
        }
      }
      return ret;
    }
}
