package unverified;

public class ClonePair3469 {

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

    boolean method2(int[] indices1,int[] indices2){
      if (indices1.length != indices2.length) {
        return false;
      }
      int len=indices1.length;
      int j;
      for (j=0; j < len; j++) {
        if (indices1[0] == indices2[j]) {
          break;
        }
      }
      if (j == len) {
        return false;
      }
      for (int i=1; i < len; i++) {
        if (indices1[i] != indices2[(j + i) % len]) {
          return false;
        }
      }
      return true;
    }
}
