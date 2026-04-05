package unverified;

public class ClonePair3465 {

    boolean method1(int[] ssid1,int[] ssid2){
      if (ssid1.length == ssid2.length) {
        for (int i=0; i < ssid1.length; i++) {
          if (ssid1[i] != ssid2[i]) {
            return false;
          }
        }
        return true;
      }
     else {
        return false;
      }
    }

    boolean method2(int[] oid1,int[] oid2){
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
}
